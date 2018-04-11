package controllers

import com.google.inject.Inject
import models._
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.{JsError, JsValue, Json}
import play.api.libs.json.Json._
import play.api.mvc._
import repo.UserRepository
import utils.Constants
import utils.JsonFormat._

import scala.concurrent.Future

class UserController @Inject()(empRepository: UserRepository) extends Controller {

  import Constants._

  val logger = Logger(this.getClass())

  private def successResponse(data: JsValue, message: String) = {
    obj("status" -> SUCCESS, "data" -> data, "msg" -> message)
  }


  def list() = Action.async {
    empRepository.getAll().map { res =>
      logger.info("User list: " + res)
      Ok(successResponse(Json.toJson(res), "Getting User list successfully"))
    }
  }


  def create() = Action.async(parse.json) { request =>
    logger.info("User Json ===> " + request.body)
    request.body.validate[User].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { emp =>
      empRepository.insert(emp).map { createdEmpId =>
        Ok(successResponse(Json.toJson(Map("id" ->createdEmpId)), "User has been created successfully."))
      }
    })
  }


  def delete(empId: Int) = Action.async { request =>
    empRepository.delete(empId).map { _ =>
      Ok(successResponse(Json.toJson("{}"), "User has been deleted successfully."))
    }
  }


  def edit(empId: Int): Action[AnyContent] = Action.async { request =>
    empRepository.getById(empId).map { empOpt =>
      empOpt.fold(Ok(obj("status" -> ERROR, "data" -> "{}", "msg" -> "User does not exist.")))(emp => Ok(
        successResponse(Json.toJson(emp), "Getting USer successfully")))
    }
  }


  def update = Action.async(parse.json) { request =>
    logger.info("User Json ===> " + request.body)
    request.body.validate[User].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { emp =>
      empRepository.update(emp).map { res => Ok(successResponse(Json.toJson("{}"), "User has been updated successfully.")) }
    })
  }

}




package controllers

import com.google.inject.Inject
import models.Location
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.Json._
import play.api.libs.json._
import play.api.mvc._
import repo.LocationRepository
import utils.Constants
import utils.JsonFormat._

import scala.concurrent.Future

/**
  * Handles all requests related to employee
  */
class LocationController @Inject()(locRepository: LocationRepository) extends Controller {

  import Constants._

  val logger = Logger(this.getClass())

  private def successResponse(data: JsValue, message: String) = {
    obj("status" -> SUCCESS, "data" -> data, "msg" -> message)
  }

  /**
    * Handles request for getting all employee from the database
    */
  def list() = Action.async {
    locRepository.getAll().map { res =>
      logger.info("Loc list: " + res)
      Ok(successResponse( Json.toJson(res), "Getting Employee list successfully"))
    }
  }

  /**
    * Handles request for creation of new employee
    */
  def create() = Action.async(parse.json) { request =>
    logger.info("Employee Json ===> " + request.body)
    request.body.validate[Location].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { loc =>
      locRepository.insert(loc).map { createdEmpId =>
        Ok(successResponse(Json.toJson(Map("id" ->createdEmpId)), "Employee has been created successfully."))
      }
    })
  }

  /**
    * Handles request for deletion of existing employee by employee_id
    */
  def delete(locId: Int) = Action.async { request =>
    locRepository.delete(locId).map { _ =>
      Ok(successResponse(Json.toJson("{}"), "Employee has been deleted successfully."))
    }
  }

  /**
    * Handles request for get employee details for editing
    */
  def edit(empId: Int): Action[AnyContent] = Action.async { request =>
    locRepository.getById(empId).map { empOpt =>
      empOpt.fold(Ok(obj("status" -> ERROR, "data" -> "{}", "msg" -> "Employee does not exist.")))(loc => Ok(
        successResponse(Json.toJson(loc), "Getting Employee successfully")))
    }
  }

  /**
    * Handles request for update existing employee
    */
  def update = Action.async(parse.json) { request =>
    logger.info("Employee Json ===> " + request.body)
    request.body.validate[Location].fold(error => Future.successful(BadRequest(JsError.toJson(error))), { loc =>
      locRepository.update(loc).map { res => Ok(successResponse(Json.toJson("{}"), "Employee has been updated successfully.")) }
    })
  }

}




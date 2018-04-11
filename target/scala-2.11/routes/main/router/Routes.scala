
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/projects/Scala/scala-play-dashboard/conf/routes
// @DATE:Wed Apr 11 12:37:27 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_3: controllers.Application,
  // @LINE:12
  UserController_1: controllers.UserController,
  // @LINE:23
  Assets_2: controllers.Assets,
  // @LINE:26
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: controllers.Application,
    // @LINE:12
    UserController_1: controllers.UserController,
    // @LINE:23
    Assets_2: controllers.Assets,
    // @LINE:26
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Application_3, UserController_1, Assets_2, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, UserController_1, Assets_2, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""", """controllers.Application.emp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/list""", """controllers.UserController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/create""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/edit""", """controllers.UserController.edit(empId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/update""", """controllers.UserController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/delete""", """controllers.UserController.delete(empId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_home0_invoker = createInvoker(
    Application_3.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "home",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_emp1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/")))
  )
  private[this] lazy val controllers_Application_emp1_invoker = createInvoker(
    Application_3.emp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "emp",
      Nil,
      "GET",
      """""",
      this.prefix + """user/"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/list")))
  )
  private[this] lazy val controllers_UserController_list2_invoker = createInvoker(
    UserController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """ Employee related routes""",
      this.prefix + """emp/list"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/create")))
  )
  private[this] lazy val controllers_UserController_create3_invoker = createInvoker(
    UserController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """emp/create"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/edit")))
  )
  private[this] lazy val controllers_UserController_edit4_invoker = createInvoker(
    UserController_1.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """emp/edit"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/update")))
  )
  private[this] lazy val controllers_UserController_update5_invoker = createInvoker(
    UserController_1.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """emp/update"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_delete6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/delete")))
  )
  private[this] lazy val controllers_UserController_delete6_invoker = createInvoker(
    UserController_1.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """emp/delete"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_WebJarAssets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at8_invoker = createInvoker(
    WebJarAssets_0.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ WebJars""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_home0_route(params) =>
      call { 
        controllers_Application_home0_invoker.call(Application_3.home)
      }
  
    // @LINE:8
    case controllers_Application_emp1_route(params) =>
      call { 
        controllers_Application_emp1_invoker.call(Application_3.emp)
      }
  
    // @LINE:12
    case controllers_UserController_list2_route(params) =>
      call { 
        controllers_UserController_list2_invoker.call(UserController_1.list)
      }
  
    // @LINE:14
    case controllers_UserController_create3_route(params) =>
      call { 
        controllers_UserController_create3_invoker.call(UserController_1.create)
      }
  
    // @LINE:16
    case controllers_UserController_edit4_route(params) =>
      call(params.fromQuery[Int]("empId", None)) { (empId) =>
        controllers_UserController_edit4_invoker.call(UserController_1.edit(empId))
      }
  
    // @LINE:18
    case controllers_UserController_update5_route(params) =>
      call { 
        controllers_UserController_update5_invoker.call(UserController_1.update)
      }
  
    // @LINE:20
    case controllers_UserController_delete6_route(params) =>
      call(params.fromQuery[Int]("empId", None)) { (empId) =>
        controllers_UserController_delete6_invoker.call(UserController_1.delete(empId))
      }
  
    // @LINE:23
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:26
    case controllers_WebJarAssets_at8_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at8_invoker.call(WebJarAssets_0.at(file))
      }
  }
}

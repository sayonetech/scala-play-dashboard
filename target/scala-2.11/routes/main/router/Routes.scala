
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/projects/Scala/scala-play-dashboard/conf/routes
// @DATE:Wed Apr 11 11:48:44 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:9
  EmployeeController_3: controllers.EmployeeController,
  // @LINE:20
  Assets_1: controllers.Assets,
  // @LINE:23
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:9
    EmployeeController_3: controllers.EmployeeController,
    // @LINE:20
    Assets_1: controllers.Assets,
    // @LINE:23
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Application_2, EmployeeController_3, Assets_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, EmployeeController_3, Assets_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/list""", """controllers.EmployeeController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/create""", """controllers.EmployeeController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/edit""", """controllers.EmployeeController.edit(empId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/update""", """controllers.EmployeeController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/delete""", """controllers.EmployeeController.delete(empId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_EmployeeController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/list")))
  )
  private[this] lazy val controllers_EmployeeController_list1_invoker = createInvoker(
    EmployeeController_3.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "list",
      Nil,
      "GET",
      """ Employee related routes""",
      this.prefix + """emp/list"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_EmployeeController_create2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/create")))
  )
  private[this] lazy val controllers_EmployeeController_create2_invoker = createInvoker(
    EmployeeController_3.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """emp/create"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_EmployeeController_edit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/edit")))
  )
  private[this] lazy val controllers_EmployeeController_edit3_invoker = createInvoker(
    EmployeeController_3.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """emp/edit"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_EmployeeController_update4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/update")))
  )
  private[this] lazy val controllers_EmployeeController_update4_invoker = createInvoker(
    EmployeeController_3.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """emp/update"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_EmployeeController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/delete")))
  )
  private[this] lazy val controllers_EmployeeController_delete5_invoker = createInvoker(
    EmployeeController_3.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """emp/delete"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:23
  private[this] lazy val controllers_WebJarAssets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at7_invoker = createInvoker(
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
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:9
    case controllers_EmployeeController_list1_route(params) =>
      call { 
        controllers_EmployeeController_list1_invoker.call(EmployeeController_3.list)
      }
  
    // @LINE:11
    case controllers_EmployeeController_create2_route(params) =>
      call { 
        controllers_EmployeeController_create2_invoker.call(EmployeeController_3.create)
      }
  
    // @LINE:13
    case controllers_EmployeeController_edit3_route(params) =>
      call(params.fromQuery[Int]("empId", None)) { (empId) =>
        controllers_EmployeeController_edit3_invoker.call(EmployeeController_3.edit(empId))
      }
  
    // @LINE:15
    case controllers_EmployeeController_update4_route(params) =>
      call { 
        controllers_EmployeeController_update4_invoker.call(EmployeeController_3.update)
      }
  
    // @LINE:17
    case controllers_EmployeeController_delete5_route(params) =>
      call(params.fromQuery[Int]("empId", None)) { (empId) =>
        controllers_EmployeeController_delete5_invoker.call(EmployeeController_3.delete(empId))
      }
  
    // @LINE:20
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:23
    case controllers_WebJarAssets_at7_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at7_invoker.call(WebJarAssets_0.at(file))
      }
  }
}

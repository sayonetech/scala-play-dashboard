
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/activator-play-slick-angularjs/conf/routes
// @DATE:Tue Apr 10 20:06:16 IST 2018

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
  // @LINE:10
  LocationController_4: controllers.LocationController,
  // @LINE:11
  EmployeeController_0: controllers.EmployeeController,
  // @LINE:22
  Assets_1: controllers.Assets,
  // @LINE:25
  WebJarAssets_2: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: controllers.Application,
    // @LINE:10
    LocationController_4: controllers.LocationController,
    // @LINE:11
    EmployeeController_0: controllers.EmployeeController,
    // @LINE:22
    Assets_1: controllers.Assets,
    // @LINE:25
    WebJarAssets_2: controllers.WebJarAssets
  ) = this(errorHandler, Application_3, LocationController_4, EmployeeController_0, Assets_1, WebJarAssets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, LocationController_4, EmployeeController_0, Assets_1, WebJarAssets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loc/""", """controllers.Application.index_loc"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loc/list""", """controllers.LocationController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emp/list""", """controllers.EmployeeController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loc/create""", """controllers.LocationController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loc/edit""", """controllers.LocationController.edit(locId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loc/update""", """controllers.LocationController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loc/delete""", """controllers.LocationController.delete(locId:Int)"""),
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
    Application_3.index,
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

  // @LINE:7
  private[this] lazy val controllers_Application_index_loc1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loc/")))
  )
  private[this] lazy val controllers_Application_index_loc1_invoker = createInvoker(
    Application_3.index_loc,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index_loc",
      Nil,
      "GET",
      """""",
      this.prefix + """loc/"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LocationController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loc/list")))
  )
  private[this] lazy val controllers_LocationController_list2_invoker = createInvoker(
    LocationController_4.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "list",
      Nil,
      "GET",
      """ Employee related routes""",
      this.prefix + """loc/list"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_EmployeeController_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emp/list")))
  )
  private[this] lazy val controllers_EmployeeController_list3_invoker = createInvoker(
    EmployeeController_0.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """emp/list"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LocationController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loc/create")))
  )
  private[this] lazy val controllers_LocationController_create4_invoker = createInvoker(
    LocationController_4.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """loc/create"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LocationController_edit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loc/edit")))
  )
  private[this] lazy val controllers_LocationController_edit5_invoker = createInvoker(
    LocationController_4.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """loc/edit"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_LocationController_update6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loc/update")))
  )
  private[this] lazy val controllers_LocationController_update6_invoker = createInvoker(
    LocationController_4.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """loc/update"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LocationController_delete7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loc/delete")))
  )
  private[this] lazy val controllers_LocationController_delete7_invoker = createInvoker(
    LocationController_4.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LocationController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """loc/delete"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_WebJarAssets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at9_invoker = createInvoker(
    WebJarAssets_2.at(fakeValue[String]),
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
        controllers_Application_index0_invoker.call(Application_3.index)
      }
  
    // @LINE:7
    case controllers_Application_index_loc1_route(params) =>
      call { 
        controllers_Application_index_loc1_invoker.call(Application_3.index_loc)
      }
  
    // @LINE:10
    case controllers_LocationController_list2_route(params) =>
      call { 
        controllers_LocationController_list2_invoker.call(LocationController_4.list)
      }
  
    // @LINE:11
    case controllers_EmployeeController_list3_route(params) =>
      call { 
        controllers_EmployeeController_list3_invoker.call(EmployeeController_0.list)
      }
  
    // @LINE:13
    case controllers_LocationController_create4_route(params) =>
      call { 
        controllers_LocationController_create4_invoker.call(LocationController_4.create)
      }
  
    // @LINE:15
    case controllers_LocationController_edit5_route(params) =>
      call(params.fromQuery[Int]("locId", None)) { (locId) =>
        controllers_LocationController_edit5_invoker.call(LocationController_4.edit(locId))
      }
  
    // @LINE:17
    case controllers_LocationController_update6_route(params) =>
      call { 
        controllers_LocationController_update6_invoker.call(LocationController_4.update)
      }
  
    // @LINE:19
    case controllers_LocationController_delete7_route(params) =>
      call(params.fromQuery[Int]("locId", None)) { (locId) =>
        controllers_LocationController_delete7_invoker.call(LocationController_4.delete(locId))
      }
  
    // @LINE:22
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:25
    case controllers_WebJarAssets_at9_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at9_invoker.call(WebJarAssets_2.at(file))
      }
  }
}

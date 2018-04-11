
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/projects/Scala/scala-play-dashboard/conf/routes
// @DATE:Wed Apr 11 12:37:27 IST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:26
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "emp/create"})
        }
      """
    )
  
    // @LINE:20
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.delete",
      """
        function(empId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emp/delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("empId", empId0)])})
        }
      """
    )
  
    // @LINE:12
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emp/list"})
        }
      """
    )
  
    // @LINE:16
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.edit",
      """
        function(empId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emp/edit" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("empId", empId0)])})
        }
      """
    )
  
    // @LINE:18
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "emp/update"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def emp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.emp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/"})
        }
      """
    )
  
  }


}

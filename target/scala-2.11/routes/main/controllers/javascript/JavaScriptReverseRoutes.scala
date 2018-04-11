
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/activator-play-slick-angularjs/conf/routes
// @DATE:Tue Apr 10 20:06:16 IST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseLocationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loc/create"})
        }
      """
    )
  
    // @LINE:19
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.delete",
      """
        function(locId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loc/delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("locId", locId0)])})
        }
      """
    )
  
    // @LINE:10
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loc/list"})
        }
      """
    )
  
    // @LINE:15
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.edit",
      """
        function(locId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loc/edit" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("locId", locId0)])})
        }
      """
    )
  
    // @LINE:17
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LocationController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loc/update"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index_loc: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index_loc",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loc/"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseEmployeeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emp/list"})
        }
      """
    )
  
  }


}


// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/activator-play-slick-angularjs/conf/routes
// @DATE:Tue Apr 10 20:06:16 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

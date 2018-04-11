
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/projects/Scala/scala-play-dashboard/conf/routes
// @DATE:Wed Apr 11 12:37:27 IST 2018


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

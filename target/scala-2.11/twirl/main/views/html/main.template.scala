
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,WebJarAssets,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*8.2*/(title: String)(webJarAssets: WebJarAssets)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.60*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="myApp">
    <head>
        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">

        <!-- Bootstrap 3.3.6 -->
        <link rel='stylesheet' href='"""),_display_(/*18.39*/routes/*18.45*/.WebJarAssets.at(webJarAssets.locate("css/bootstrap.min.css"))),format.raw/*18.107*/("""'>

        <!-- Custom CSS Links -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">

    </head>
    <body>

    <header>
        <span class="glyphicon glyphicon-menu-hamburger header-icon" aria-hidden="true"></span>
        <h3 class="page-header" style="">"""),_display_(/*28.43*/title),format.raw/*28.48*/("""</h3>
    </header>

        <div class="container-fluid body-content">
            """),_display_(/*32.14*/content),format.raw/*32.21*/("""
        """),format.raw/*33.9*/("""</div>

        <!-- Plugin Javascript -->
        <script type="text/javascript" src='"""),_display_(/*36.46*/routes/*36.52*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*36.106*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*37.46*/routes/*37.52*/.WebJarAssets.at(webJarAssets.locate("js/bootstrap.min.js"))),format.raw/*37.112*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*38.46*/routes/*38.52*/.WebJarAssets.at(webJarAssets.locate("angular.min.js"))),format.raw/*38.107*/("""'></script>
       <script type="text/javascript" src='"""),_display_(/*39.45*/routes/*39.51*/.WebJarAssets.at(webJarAssets.locate("ui-bootstrap-tpls.min.js"))),format.raw/*39.116*/("""'></script>
       <script type="text/javascript" src='"""),_display_(/*40.45*/routes/*40.51*/.WebJarAssets.at(webJarAssets.locate("angular-animate.min.js"))),format.raw/*40.114*/("""'></script>

         <!-- #Custom Javascripts Links -->
        <script type="text/javascript" src=""""),_display_(/*43.46*/routes/*43.52*/.Assets.versioned("javascripts/app.js")),format.raw/*43.91*/(""""></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,webJarAssets:WebJarAssets,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(webJarAssets)(content)

  def f:((String) => (WebJarAssets) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (webJarAssets) => (content) => apply(title)(webJarAssets)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 12:30:37 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/main.scala.html
                  HASH: 4b2469c039dd2780056999c2c14ad1f8c9cd8472
                  MATRIX: 797->261|950->319|979->321|1081->396|1107->401|1202->469|1217->475|1278->514|1380->589|1395->595|1479->657|1597->748|1612->754|1675->795|1881->974|1907->979|2019->1064|2047->1071|2083->1080|2198->1168|2213->1174|2289->1228|2373->1285|2388->1291|2470->1351|2554->1408|2569->1414|2646->1469|2729->1525|2744->1531|2831->1596|2914->1652|2929->1658|3014->1721|3143->1823|3158->1829|3218->1868
                  LINES: 25->8|30->8|32->10|35->13|35->13|37->15|37->15|37->15|40->18|40->18|40->18|43->21|43->21|43->21|50->28|50->28|54->32|54->32|55->33|58->36|58->36|58->36|59->37|59->37|59->37|60->38|60->38|60->38|61->39|61->39|61->39|62->40|62->40|62->40|65->43|65->43|65->43
                  -- GENERATED --
              */
          
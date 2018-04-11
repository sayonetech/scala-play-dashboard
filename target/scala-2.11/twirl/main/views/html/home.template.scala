
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("List of Tables")/*3.24*/(webJarAssets)/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""

"""),format.raw/*5.1*/("""<div>

    <table>
        <thead><tr><th>Name</th></tr></thead>
        <tbody>
            <tr><th><a href="/user/">Users</a></th></tr>
            <tr><th><a href="/loc/">Location</a></th></tr>
            <tr><th><a href="/wine/">Wine</a></th></tr>
            <tr><th><a href="/taste/">Taste</a></th></tr>
            <tr><th><a href="/aroma/">Aroma</a></th></tr>
            <tr><th><a href="/pair/">Pairing</a></th></tr>
        </tbody>
    </table>
</div>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets)

  def f:((WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets) => apply(webJarAssets)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 12:37:27 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/home.scala.html
                  HASH: 54fe136cef8c0b7334ae56f9290c6dea5b3790c1
                  MATRIX: 531->1|654->29|682->32|712->54|734->68|773->70|801->72|1297->538
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|43->19
                  -- GENERATED --
              */
          
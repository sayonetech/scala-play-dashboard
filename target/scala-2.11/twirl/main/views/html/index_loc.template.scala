
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_loc_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index_loc extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Play Angular App")/*3.26*/(webJarAssets)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""

"""),format.raw/*5.1*/("""<div ng-controller="locCtrl">

    <div>
        <div class="row emp-header">
            <!-- Employee search -->
        <div class="col-sm-4 col-md-4 col-lg-4">
            <input class="form-control" style="width: 70%;" type="text" ng-model="searchLoc" placeholder="Search location ..."/>
        </div>
            <!-- Alert messages -->
            <div class="col-sm-4 col-md-4 col-lg-4">
                <div ng-repeat="alert in alerts">
                <notification ng-model="alert"></notification>
                </div>
            </div>
            <!-- Add new employee link -->
        <div class="col-sm-4 col-md-4 col-lg-4">
          <botton class="btn btn-success btn-sm add-button" style="font-weight: 600;" data-toggle="modal" data-target="#newLocModal">Add New Location</botton>
        </div>
        </div>
     </div>
    <hr>

        """),_display_(/*27.10*/views/*27.15*/.html.employee.empList()),format.raw/*27.39*/("""
        """),_display_(/*28.10*/views/*28.15*/.html.employee.newEmpForm()),format.raw/*28.42*/("""
        """),_display_(/*29.10*/views/*29.15*/.html.employee.editEmpForm()),format.raw/*29.43*/("""
"""),format.raw/*30.1*/("""</div>
""")))}),format.raw/*31.2*/("""
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
object index_loc extends index_loc_Scope0.index_loc
              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 20:02:46 IST 2018
                  SOURCE: /home/jk/activator-play-slick-angularjs/app/views/index_loc.scala.html
                  HASH: 2926d5fa4dcc6506d7f13dc804644a5457551362
                  MATRIX: 541->1|664->29|692->32|724->56|746->70|785->72|813->74|1704->938|1718->943|1763->967|1800->977|1814->982|1862->1009|1899->1019|1913->1024|1962->1052|1990->1053|2028->1061
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|55->31
                  -- GENERATED --
              */
          
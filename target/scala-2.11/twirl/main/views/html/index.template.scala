
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("User Database")/*3.23*/(webJarAssets)/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""

"""),format.raw/*5.1*/("""<div ng-controller="empCtrl">

    <div>
        <div class="row emp-header">
            <!-- Employee search -->
        <div class="col-sm-4 col-md-4 col-lg-4">
            <input class="form-control" style="width: 70%;" type="text" ng-model="searchEmp" placeholder="Search User ..."/>
        </div>
            <!-- Alert messages -->
            <div class="col-sm-4 col-md-4 col-lg-4">
                <div ng-repeat="alert in alerts">
                <notification ng-model="alert"></notification>
                </div>
            </div>
            <!-- Add new employee link -->
        <div class="col-sm-4 col-md-4 col-lg-4">
          <botton class="btn btn-success btn-sm add-button" style="font-weight: 600;" data-toggle="modal" data-target="#newEmpModal">Add New User</botton>
        </div>
        </div>
     </div>
    <hr>

    """),_display_(/*27.6*/views/*27.11*/.html.employee.empList()),format.raw/*27.35*/("""
    """),_display_(/*28.6*/views/*28.11*/.html.employee.newEmpForm()),format.raw/*28.38*/("""
    """),_display_(/*29.6*/views/*29.11*/.html.employee.editEmpForm()),format.raw/*29.39*/("""

"""),format.raw/*31.1*/("""</div>
""")))}),format.raw/*32.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 13:28:07 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/index.scala.html
                  HASH: ab1280489620222dedc66228f6bb776b1704b431
                  MATRIX: 533->1|656->29|684->32|713->53|735->67|774->69|802->71|1680->923|1694->928|1739->952|1771->958|1785->963|1833->990|1865->996|1879->1001|1928->1029|1957->1031|1995->1039
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|55->31|56->32
                  -- GENERATED --
              */
          
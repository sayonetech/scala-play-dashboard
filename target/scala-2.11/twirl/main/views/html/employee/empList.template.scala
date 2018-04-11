
package views.html.employee

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object empList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class empList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<table class="table table-hover">
    <thead>
    <th>Username</th>
    <th>Email</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="user in employees | filter: searchEmp">
        <td>"""),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""user.username"""),format.raw/*12.28*/("""}"""),format.raw/*12.29*/("""}"""),format.raw/*12.30*/("""</td>
        <td>"""),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""user.email"""),format.raw/*13.25*/("""}"""),format.raw/*13.26*/("""}"""),format.raw/*13.27*/("""</td>
        <td>"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""user.firstname"""),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""}"""),format.raw/*14.31*/("""</td>
        <td>"""),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""{"""),format.raw/*15.15*/("""user.lastname"""),format.raw/*15.28*/("""}"""),format.raw/*15.29*/("""}"""),format.raw/*15.30*/("""</td>
        <td>
            <i title="Edit" style="color: #128d36;" data-toggle="modal" data-target="#editEmpModal" class="glyphicon glyphicon-edit cursorPointer" ng-click="editEmployee(user)">
            </i>
        </td>
        <td>
            <i title="Delete" style="color: #d85010;" class="glyphicon glyphicon-trash cursorPointer" ng-confirm-message="Are you sure want to delete?" ng-confirm-click="deleteEmployee(user.id)">
            </i>
        </td>
    </tr>
    </tbody>
</table>

<p style="color: rgb(110, 114, 114)">Showing <strong style="color: rgb(42, 41, 41);">"""),format.raw/*28.86*/("""{"""),format.raw/*28.87*/("""{"""),format.raw/*28.88*/(""" """),format.raw/*28.89*/("""(employees | filter:searchEmp).length """),format.raw/*28.127*/("""}"""),format.raw/*28.128*/("""}"""),format.raw/*28.129*/("""</strong> of <strong style="color: rgb(16, 106, 135);">"""),format.raw/*28.184*/("""{"""),format.raw/*28.185*/("""{"""),format.raw/*28.186*/("""employees.length"""),format.raw/*28.202*/("""}"""),format.raw/*28.203*/("""}"""),format.raw/*28.204*/("""</strong> entries</p>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object empList extends empList_Scope0.empList
              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 12:58:43 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/employee/empList.scala.html
                  HASH: af9359de0fbe489c851962141c0990a358def19a
                  MATRIX: 622->0|908->258|937->259|966->260|1007->273|1036->274|1065->275|1111->293|1140->294|1169->295|1207->305|1236->306|1265->307|1311->325|1340->326|1369->327|1411->341|1440->342|1469->343|1515->361|1544->362|1573->363|1614->376|1643->377|1672->378|2286->964|2315->965|2344->966|2373->967|2440->1005|2470->1006|2500->1007|2584->1062|2614->1063|2644->1064|2689->1080|2719->1081|2749->1082
                  LINES: 25->1|36->12|36->12|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28
                  -- GENERATED --
              */
          
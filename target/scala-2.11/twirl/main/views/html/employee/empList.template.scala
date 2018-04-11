
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
    <th>Name</th>
    <th>Email</th>
    <th>Company</th>
    <th>Position</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="emp in employees | filter: searchEmp">
        <td>"""),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""emp.name"""),format.raw/*12.23*/("""}"""),format.raw/*12.24*/("""}"""),format.raw/*12.25*/("""</td>
        <td>"""),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""emp.email"""),format.raw/*13.24*/("""}"""),format.raw/*13.25*/("""}"""),format.raw/*13.26*/("""</td>
        <td>"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""emp.companyName"""),format.raw/*14.30*/("""}"""),format.raw/*14.31*/("""}"""),format.raw/*14.32*/("""</td>
        <td>"""),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""{"""),format.raw/*15.15*/("""emp.position"""),format.raw/*15.27*/("""}"""),format.raw/*15.28*/("""}"""),format.raw/*15.29*/("""</td>
        <td>
            <i title="Edit" style="color: #128d36;" data-toggle="modal" data-target="#editEmpModal" class="glyphicon glyphicon-edit cursorPointer" ng-click="editEmployee(emp)">
            </i>
        </td>
        <td>
            <i title="Delete" style="color: #d85010;" class="glyphicon glyphicon-trash cursorPointer" ng-confirm-message="Are you sure want to delete?" ng-confirm-click="deleteEmployee(emp.id)">
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
                  DATE: Wed Apr 11 11:44:54 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/employee/empList.scala.html
                  HASH: 949c8abda465589b370674afa3217390f42d83fc
                  MATRIX: 622->0|899->249|928->250|957->251|993->259|1022->260|1051->261|1097->279|1126->280|1155->281|1192->290|1221->291|1250->292|1296->310|1325->311|1354->312|1397->327|1426->328|1455->329|1501->347|1530->348|1559->349|1599->361|1628->362|1657->363|2269->947|2298->948|2327->949|2356->950|2423->988|2453->989|2483->990|2567->1045|2597->1046|2627->1047|2672->1063|2702->1064|2732->1065
                  LINES: 25->1|36->12|36->12|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28|52->28
                  -- GENERATED --
              */
          

package views.html.employee

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editEmpForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editEmpForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<!-- Employee Edit Form Modal -->
<form name="editEmpForm" ng-submit="updateEmployee()">
    <div class="modal fade" id="editEmpModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Edit Employee</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">UserName</label>
                        <input type="text" class="form-control" ng-model="selectedEmployee.username" id="username" value=""""),format.raw/*15.123*/("""{"""),format.raw/*15.124*/("""{"""),format.raw/*15.125*/("""selectedEmployee.username"""),format.raw/*15.150*/("""}"""),format.raw/*15.151*/("""}"""),format.raw/*15.152*/("""" required>
                    </div>

                    <div class="form-group">
                        <label for="email">Email address</label>
                        <input type="email" class="form-control" ng-model="selectedEmployee.email" id="email" required value=""""),format.raw/*20.127*/("""{"""),format.raw/*20.128*/("""{"""),format.raw/*20.129*/("""selectedEmployee.email"""),format.raw/*20.151*/("""}"""),format.raw/*20.152*/("""}"""),format.raw/*20.153*/("""">
                    </div>

                    <div class="form-group">
                        <label for="position">First Name</label>
                        <input type="text" class="form-control" ng-model="selectedEmployee.firstname" value=""""),format.raw/*25.110*/("""{"""),format.raw/*25.111*/("""{"""),format.raw/*25.112*/("""selectedEmployee.firstname"""),format.raw/*25.138*/("""}"""),format.raw/*25.139*/("""}"""),format.raw/*25.140*/("""" id="firstname" required>
                    </div>

                    <div class="form-group">
                        <label for="companyName">Last Name</label>
                        <input type="text" class="form-control" ng-model="selectedEmployee.lastname" value=""""),format.raw/*30.109*/("""{"""),format.raw/*30.110*/("""{"""),format.raw/*30.111*/("""selectedEmployee.lastname"""),format.raw/*30.136*/("""}"""),format.raw/*30.137*/("""}"""),format.raw/*30.138*/("""" id="lastname" required>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" >Cancel</button>
                    <input type="submit" ng-disabled="editEmpForm.$invalid" class="btn btn-warning" value="Save" />
                </div>
            </div>
        </div>
    </div>
</form>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/**/
object editEmpForm extends editEmpForm_Scope0.editEmpForm
              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 13:02:33 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/employee/editEmpForm.scala.html
                  HASH: c290960792a10f8b91361d75a8d4c5f754eedfe9
                  MATRIX: 545->1|652->13|680->15|1555->861|1585->862|1615->863|1669->888|1699->889|1729->890|2034->1166|2064->1167|2094->1168|2145->1190|2175->1191|2205->1192|2484->1442|2514->1443|2544->1444|2599->1470|2629->1471|2659->1472|2963->1747|2993->1748|3023->1749|3077->1774|3107->1775|3137->1776
                  LINES: 20->1|25->1|27->3|39->15|39->15|39->15|39->15|39->15|39->15|44->20|44->20|44->20|44->20|44->20|44->20|49->25|49->25|49->25|49->25|49->25|49->25|54->30|54->30|54->30|54->30|54->30|54->30
                  -- GENERATED --
              */
          
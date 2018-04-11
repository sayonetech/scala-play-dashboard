
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
                        <label for="name">Name</label>
                        <input type="text" class="form-control" ng-model="selectedEmployee.name" id="name" value=""""),format.raw/*15.115*/("""{"""),format.raw/*15.116*/("""{"""),format.raw/*15.117*/("""selectedEmployee.name"""),format.raw/*15.138*/("""}"""),format.raw/*15.139*/("""}"""),format.raw/*15.140*/("""" required>
                    </div>

                    <div class="form-group">
                        <label for="email">Email address</label>
                        <input type="email" class="form-control" ng-model="selectedEmployee.email" id="email" required value=""""),format.raw/*20.127*/("""{"""),format.raw/*20.128*/("""{"""),format.raw/*20.129*/("""selectedEmployee.email"""),format.raw/*20.151*/("""}"""),format.raw/*20.152*/("""}"""),format.raw/*20.153*/("""">
                    </div>

                    <div class="form-group">
                        <label for="position">Position</label>
                        <input type="text" class="form-control" ng-model="selectedEmployee.position" value=""""),format.raw/*25.109*/("""{"""),format.raw/*25.110*/("""{"""),format.raw/*25.111*/("""selectedEmployee.position"""),format.raw/*25.136*/("""}"""),format.raw/*25.137*/("""}"""),format.raw/*25.138*/("""" id="position" required>
                    </div>

                    <div class="form-group">
                        <label for="companyName">Company Name</label>
                        <input type="text" class="form-control" ng-model="selectedEmployee.companyName" value=""""),format.raw/*30.112*/("""{"""),format.raw/*30.113*/("""{"""),format.raw/*30.114*/("""selectedEmployee.companyName"""),format.raw/*30.142*/("""}"""),format.raw/*30.143*/("""}"""),format.raw/*30.144*/("""" id="companyName" required>
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
                  DATE: Tue Apr 10 18:07:13 IST 2018
                  SOURCE: /home/jk/activator-play-slick-angularjs/app/views/employee/editEmpForm.scala.html
                  HASH: 68e0455f83e1e9b63889048762352e624408a80a
                  MATRIX: 545->1|652->13|680->15|1543->849|1573->850|1603->851|1653->872|1683->873|1713->874|2018->1150|2048->1151|2078->1152|2129->1174|2159->1175|2189->1176|2465->1423|2495->1424|2525->1425|2579->1450|2609->1451|2639->1452|2948->1732|2978->1733|3008->1734|3065->1762|3095->1763|3125->1764
                  LINES: 20->1|25->1|27->3|39->15|39->15|39->15|39->15|39->15|39->15|44->20|44->20|44->20|44->20|44->20|44->20|49->25|49->25|49->25|49->25|49->25|49->25|54->30|54->30|54->30|54->30|54->30|54->30
                  -- GENERATED --
              */
          
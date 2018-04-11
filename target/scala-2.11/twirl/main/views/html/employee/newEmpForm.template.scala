
package views.html.employee

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newEmpForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newEmpForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!-- Employee Form Modal -->
<form id="newEmpForm" role="form" ng-submit="addEmployee()">
    <div class="modal fade" id="newEmpModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Fill Employee Details</h4>
                </div>
                <div class="modal-body">

                    <div class="form-group">
                        <label for="empName">Name</label>
                        <input type="text" class="form-control" id="empName" name="name" ng-model="newEmployee.name" placeholder="Name" required>
                    </div>

                    <div class="form-group">
                        <label for="empEmail">Email address</label>
                        <input type="email" class="form-control" id="empEmail" name="email" ng-model="newEmployee.email" placeholder="Email" required>
                    </div>

                    <div class="form-group">
                        <label for="empPosition">Position</label>
                        <input type="text" class="form-control" id="empPosition"  name="position" ng-model="newEmployee.position" placeholder="Position" required>
                    </div>

                    <div class="form-group">
                        <label for="empCompanyName">Company Name</label>
                        <input type="text" class="form-control" id="empCompanyName"  name="companyName" ng-model="newEmployee.companyName" placeholder="Company Name" required>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" >Cancel</button>
                    <input type="submit" ng-disabled="newEmpForm.$invalid" class="btn btn-warning" id="submit" value="Add New" />
                </div>
            </div>
        </div>
    </div>
</form>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object newEmpForm extends newEmpForm_Scope0.newEmpForm
              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 11:44:54 IST 2018
                  SOURCE: /home/jk/projects/Scala/scala-play-dashboard/app/views/employee/newEmpForm.scala.html
                  HASH: 71ca5ad0d1610bc61153726b867c6fb260e3a254
                  MATRIX: 628->1
                  LINES: 25->2
                  -- GENERATED --
              */
          

package views.html.location

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object locList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class locList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<table class="table table-hover">
    <thead>
    <th>Name</th>
    <th>Email</th>
    <th>Lat, Long</th>
    <th>Position</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="loc in locations | filter: searchEmp">
        <td>"""),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""loc.name"""),format.raw/*12.23*/("""}"""),format.raw/*12.24*/("""}"""),format.raw/*12.25*/("""</td>
        <td>"""),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""loc.email"""),format.raw/*13.24*/("""}"""),format.raw/*13.25*/("""}"""),format.raw/*13.26*/("""</td>
        <td>"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""loc.lat"""),format.raw/*14.22*/("""}"""),format.raw/*14.23*/("""}"""),format.raw/*14.24*/(""" """),format.raw/*14.25*/(""", """),format.raw/*14.27*/("""{"""),format.raw/*14.28*/("""{"""),format.raw/*14.29*/("""loc.long"""),format.raw/*14.37*/("""}"""),format.raw/*14.38*/("""}"""),format.raw/*14.39*/("""</td>
        <td>"""),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""{"""),format.raw/*15.15*/("""loc.locType"""),format.raw/*15.26*/("""}"""),format.raw/*15.27*/("""}"""),format.raw/*15.28*/("""</td>
        <td><img src=""""),format.raw/*16.23*/("""{"""),format.raw/*16.24*/("""{"""),format.raw/*16.25*/("""loc.image"""),format.raw/*16.34*/("""}"""),format.raw/*16.35*/("""}"""),format.raw/*16.36*/("""" alt=""""),format.raw/*16.43*/("""{"""),format.raw/*16.44*/("""{"""),format.raw/*16.45*/("""loc.name"""),format.raw/*16.53*/("""}"""),format.raw/*16.54*/("""}"""),format.raw/*16.55*/("""" width="auto" height="50"></td>
        <td>
            <i title="Edit" style="color: #128d36;" data-toggle="modal" data-target="#editEmpModal" class="glyphicon glyphicon-edit cursorPointer" ng-click="editLocation(loc)">
            </i>
        </td>
        <td>
            <i title="Delete" style="color: #d85010;" class="glyphicon glyphicon-trash cursorPointer" ng-confirm-message="Are you sure want to delete?" ng-confirm-click="deleteLocation(loc.id)">
            </i>
        </td>
    </tr>
    </tbody>
</table>

<p style="color: rgb(110, 114, 114)">Showing <strong style="color: rgb(42, 41, 41);">"""),format.raw/*29.86*/("""{"""),format.raw/*29.87*/("""{"""),format.raw/*29.88*/(""" """),format.raw/*29.89*/("""(employees | filter:searchEmp).length """),format.raw/*29.127*/("""}"""),format.raw/*29.128*/("""}"""),format.raw/*29.129*/("""</strong> of <strong style="color: rgb(16, 106, 135);">"""),format.raw/*29.184*/("""{"""),format.raw/*29.185*/("""{"""),format.raw/*29.186*/("""employees.length"""),format.raw/*29.202*/("""}"""),format.raw/*29.203*/("""}"""),format.raw/*29.204*/("""</strong> entries</p>
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
object locList extends locList_Scope0.locList
              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 19:13:59 IST 2018
                  SOURCE: /home/jk/activator-play-slick-angularjs/app/views/location/locList.scala.html
                  HASH: 63c39ca0e9f9881cffbba951d40d8128a99b8f74
                  MATRIX: 622->0|901->251|930->252|959->253|995->261|1024->262|1053->263|1099->281|1128->282|1157->283|1194->292|1223->293|1252->294|1298->312|1327->313|1356->314|1391->321|1420->322|1449->323|1478->324|1508->326|1537->327|1566->328|1602->336|1631->337|1660->338|1706->356|1735->357|1764->358|1803->369|1832->370|1861->371|1917->399|1946->400|1975->401|2012->410|2041->411|2070->412|2105->419|2134->420|2163->421|2199->429|2228->430|2257->431|2896->1042|2925->1043|2954->1044|2983->1045|3050->1083|3080->1084|3110->1085|3194->1140|3224->1141|3254->1142|3299->1158|3329->1159|3359->1160
                  LINES: 25->1|36->12|36->12|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|40->16|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29|53->29
                  -- GENERATED --
              */
          
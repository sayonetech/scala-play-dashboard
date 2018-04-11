package controllers

import javax.inject.Inject

import play.api.mvc._
import views.html

class Application @Inject()(webJarAssets: WebJarAssets) extends Controller {

  def home = Action {Ok(html.home(webJarAssets))}

  def emp = Action {Ok(html.index(webJarAssets))}
//  def loc = Action {Ok(html.index(webJarAssets))}

}

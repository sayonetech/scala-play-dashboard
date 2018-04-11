package controllers

import javax.inject.Inject

import play.api.mvc._
import views.html

class Application @Inject()(webJarAssets: WebJarAssets) extends Controller {

  def index = Action {Ok(html.index(webJarAssets))}
  def index_loc = Action {Ok(html.index_loc(webJarAssets))}

}

package controllers

import javax.inject.Inject
import play.api.mvc.{Action, Controller}

class ContactsController @Inject() extends Controller {

  def index = Action {
    Ok("All my contacts")
  }
}

package controllers

import javax.inject.Inject
import models.Contact
import play.api.mvc.{AnyContent, Action, Controller}
import play.twirl.api.Html

class ContactsController @Inject() extends Controller {

  private def withinLayout(html: Html) = views.html.layouts.application(html)

  def index: Action[AnyContent] = Action {
    val contacts = Contact.all
    Ok(withinLayout(views.html.contacts.index(contacts)))
  }

  def create: Action[AnyContent]           = Action { Ok("") }
  def show(id: Long): Action[AnyContent]   = Action { Ok("") }
  def update(id: Long): Action[AnyContent] = Action { Ok("") }
  def delete(id: Long): Action[AnyContent] = Action { Ok("") }
}

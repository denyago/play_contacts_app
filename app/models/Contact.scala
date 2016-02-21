package models

import anorm.SQL
import play.api.db.DB
import play.api.Play.current

case class Contact(id: Long, name: String, email: String)

object Contact {
  def all: List[Contact]= {
    DB.withConnection { implicit connection =>
      SQL("SELECT * FROM contacts")().map { row =>
        Contact(
          id    = row[Long]("id"),
          name  = row[String]("name"),
          email = row[String]("name")
        )
      }.toList
    }
  }
}

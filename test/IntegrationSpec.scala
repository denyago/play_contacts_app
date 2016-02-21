import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._

@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {
  def urlTo(path: String, port: Int): String = s"http://localhost:$port$path"

  "Application" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlTo("/", port))
      browser.pageSource must contain("All my contacts")
    }

    "return 404 pages for wrong URLs" in new WithBrowser {
      browser.goTo(urlTo("/not-exists", port))
      // TODO: Change me to custom 404 page
      browser.pageSource must contain("Action not found")
    }
  }
}

package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.i18n._

import play.api.data._
import play.api.data.Forms._

import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

/**
 * $model;format="Camel"$ form controller specs
 */
class $model;format="Camel"$ControllerSpec extends PlaySpec with OneAppPerTest {

  "$model;format="Camel"$Controller GET" should {

    "render the index page from a new instance of controller" in {
      val controller = new $model;format="Camel"$Controller
      val home = controller.$model;format="Camel"$Get().apply(FakeRequest())

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
    }

    "render the index page from the application" in {
      val controller = app.injector.instanceOf[$model;format="Camel"$Controller]
      val home = controller.$model;format="Camel"$Get().apply(FakeRequest())

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
    }

    "render the index page from the router" in {
      // Need to specify Host header to get through AllowedHostsFilter
      val request = FakeRequest(GET, "/$model;format="camel"$")
        .withHeaders("Host" -> "localhost")
      val home = route(app, request).get

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
    }
  }

  "$model;format="Camel"$Controller POST" should {
    "process form" in {
      // Need to specify Host header to get through AllowedHostsFilter
      val controller = app.injector.instanceOf[$model;format="Camel"$Controller]
      val request = FakeRequest(POST, "/$model;format="camel"$")
        .withHeaders("Host" -> "localhost")
        .withFormUrlEncodedBody("name" -> "play", age -> "4")
      val home = controller.$model;format="camel"$Post().apply(request)

      status(home) mustBe SEE_OTHER
      contentType(home) mustBe Some("text/html")
    }
  }

}

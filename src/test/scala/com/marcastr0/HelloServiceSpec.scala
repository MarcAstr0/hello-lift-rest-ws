package com.marcastr0

import org.specs2.mutable.Specification
import net.liftweb.mockweb.MockWeb._
import scala.xml.Text

class HelloServiceSpec extends Specification {

  "HelloService" should {
    "say \"Hello World\" if no name is present" in {
      testS("/hello") {
        HelloService.hello("World") ==== Text("Hello World")
      }
    }

    "say \"Hello\" and the name sent" in {
      testS("/hello/Mario") {
        HelloService.hello("Mario") ==== Text("Hello Mario")
      }
    }
  }
}

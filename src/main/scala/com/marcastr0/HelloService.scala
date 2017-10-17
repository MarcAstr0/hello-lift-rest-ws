package com.marcastr0

import net.liftweb.http.rest.RestHelper
import net.liftweb.http.LiftRules

import scala.xml.Text

object HelloService extends RestHelper {

  def init() : Unit = {
    LiftRules.statelessDispatch.append(HelloService)
  }

  serve {
    case "hello" :: Nil Get req => hello("World")
    case "hello" :: name :: Nil Get req => hello(name)
  }

  def hello(name: String): Text = {
    return Text("Hello " + name)
  }
}

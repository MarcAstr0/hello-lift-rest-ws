package bootstrap.liftweb

import com.marcastr0.HelloService
import net.liftweb.http.{Html5Properties, LiftRules, Req}
import net.liftweb.sitemap.{Menu, SiteMap}

/**
  * A class that's instantiated early and run.  It allows the application
  * to modify lift's environment
  */
class Boot {
  // where to search snippet
  LiftRules.addToPackages("com.marcastr0.liftfromscratch")

  // Build SiteMap
  def sitemap(): SiteMap = SiteMap(
    Menu.i("Home") / "index"
  )

  HelloService.init()

  // Use HTML5 for rendering
  LiftRules.htmlProperties.default.set((r: Req) =>
    new Html5Properties(r.userAgent))
}

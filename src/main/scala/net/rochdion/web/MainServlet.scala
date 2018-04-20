package net.rochdion.web

import org.scalatra._
import play.twirl.api.Html

class MainServlet extends ScalatraServlet {

  private def renderWithMainLayout(pageTitle: String, main: Html) = layouts.html.layout.render(
      pageTitle = "Home",
      header = views.html.header.render(),
      nav = views.html.nav.render(),
      main,
      footer = views.html.footer.render()
    )

  get("/") {
    renderWithMainLayout("Home", views.html.home.render())
  }

  get("/about") {
    renderWithMainLayout("About me", views.html.about.render())
  }
}

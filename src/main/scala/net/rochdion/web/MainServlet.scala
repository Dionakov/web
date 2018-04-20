package net.rochdion.web

import org.scalatra._
import play.twirl.api.Html

class MainServlet extends ScalatraServlet {

  private def renderWithMainLayout(pageTitle: String, main: Html, currentNavIndex: Int = 0) = layouts.html.layout.render(
      pageTitle = "Home",
      header = views.html.header.render(),
      nav = views.html.nav.render(currentNavIndex),
      main,
      footer = views.html.footer.render()
    )

  get("/portfolio") {
    renderWithMainLayout("Portfolio", views.html.portfolio.render(), 3)
  }
  get("/cv") {
    renderWithMainLayout("Curriculum Vitae", views.html.cv.render(), 2)
  }

  get("/about") {
    renderWithMainLayout("About me", views.html.about.render(), 1)
  }

  get("/") {
    redirect("/about")
  }
}

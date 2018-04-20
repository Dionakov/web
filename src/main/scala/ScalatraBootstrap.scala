import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import net.rochdion.web.MainServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new MainServlet, "/*")
  }
}

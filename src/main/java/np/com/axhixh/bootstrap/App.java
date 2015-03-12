package np.com.axhixh.bootstrap;

import io.undertow.Undertow;
import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by axhixh on 11/03/15.
 */
public class App {
    public static void main(String[] args) {
        UndertowJaxrsServer server = new UndertowJaxrsServer();
        server.deploy(RestApp.class);
        final Undertow.Builder builder = Undertow.builder().addHttpListener(8080, "localhost");
        server.start(builder);
    }

    @ApplicationPath("/api")
    public static class RestApp extends Application {
        @Override
        public Set<Class<?>> getClasses() {
            Set<Class<?>> classes = new HashSet<Class<?>>();
            classes.add(NotesResource.class);
            classes.add(HelloResourceImpl.class);
            return classes;
        }
    }
}

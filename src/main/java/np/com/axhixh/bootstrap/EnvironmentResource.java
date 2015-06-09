package np.com.axhixh.bootstrap;

import java.util.Map.Entry;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/environment")
public class EnvironmentResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String list() {
        StringBuilder result = new StringBuilder();
        for (Entry<String, String> entry : System.getenv().entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append('\n');
        }
        return result.toString();
    }
}

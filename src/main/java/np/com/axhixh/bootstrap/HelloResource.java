package np.com.axhixh.bootstrap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

/**
 * Created by ashish on 12/03/15.
 */
@Path("/greet")
public interface HelloResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet();

    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@PathParam("name") String name);
}

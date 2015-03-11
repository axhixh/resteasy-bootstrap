package np.com.axhixh.bootstrap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ashish on 11/03/15.
 */
@Path("/notes")
public class NotesResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String list() {
        return "note 1\nnote 2\nnote 3\n";
    }

    @GET
    @Path("/last")
    @Produces(MediaType.TEXT_PLAIN)
    public String last() {
        return "note 3\n";
    }
}

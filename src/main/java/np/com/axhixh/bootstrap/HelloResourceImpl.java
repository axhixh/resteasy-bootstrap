package np.com.axhixh.bootstrap;

import javax.ws.rs.PathParam;
import java.util.Random;

/**
 * Created by ashish on 12/03/15.
 */
public class HelloResourceImpl implements HelloResource {

    public String greet() {
        return greet("World");
    }

    public String greet(@PathParam("name") String name) {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException ignored) {

        }
        return String.format("Hello %s\n", name);
    }
}

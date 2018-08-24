package ch.javaee.simplerestexample;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author marco
 */
@Provider  // @Provider tell the server that this is a REST class
@Path("examples") // define the path for this class: [server]/rest/examples
public class RestHelloWorld {
    
    @Path("helloWorld") // path used to call the method [server]/rest/examples/examples
    @GET // answer only to a http get request
    public String hello(){  // return a simple string (text/plain by default)
        return "Hello World"; // string to be returned
    }
    
    @Path("helloJson")
    @GET
    @Produces("application/json")
    public List<String> helloJSONList(){
        List<String> jsonList = new ArrayList<String>();
        jsonList.add("Hello World");
        jsonList.add("Bonjour monde");
        
        return jsonList;
    }
    
    @Path("helloPost")
    @POST
    @Produces("application/json")
    public List<String> helloPost(String inputStr){
        
        System.out.println("receive POST with input " + inputStr);
        
        List<String> jsonList = new ArrayList<String>();
        jsonList.add("Hello World");
        jsonList.add("Bonjour monde");
        
        return jsonList;
    }
    
    
    
}

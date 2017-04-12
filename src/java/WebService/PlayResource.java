/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author Khaderik
 */
@Path("play")
public class PlayResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PlayResource
     */
    public PlayResource() {
    }

    /**
     * Retrieves representation of an instance of WebService.PlayResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{x}/{y}/{idJoueur}")
    public String play(@PathParam("x") int x,@PathParam("y") int y, @PathParam("idJoueur") String idJoueur) {
        
        //TODO return proper representation object
       return String.format("test play: %s,%s,%s,", x,y,idJoueur);
    }
}

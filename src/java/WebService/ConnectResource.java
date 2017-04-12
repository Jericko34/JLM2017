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

/**
 * REST Web Service
 *
 * @author Khaderik
 */
@Path("connect")
public class ConnectResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ConnectResource
     */
    public ConnectResource() {
    }

    /**
     * Retrieves representation of an instance of WebService.ConnectResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{joueurName}")
    public String connect(@PathParam("joueurName") String nomJoueur) {
        
        
        //TODO return proper representation object
     return String.format("test connect: %s", serveurjeu.Partie.getInstance().ajouterJoueur(nomJoueur));
    }
}

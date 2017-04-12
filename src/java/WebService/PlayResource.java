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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
     * @param x
     * @param y
     * @param idJoueur
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/{x}/{y}/{idJoueur}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response play(@PathParam("x") int x,@PathParam("y") int y, @PathParam("idJoueur") String idJoueur) {
        
         MesDTOs.PlayDTO result = serveurjeu.AdapteurPlay.getInstance().play(x, y, idJoueur);
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
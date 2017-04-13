/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import MesDTOs.InfoPartieDTO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import serveurjeu.AdaptateurPartie;

/**
 * REST Web Service
 *
 * @author Khaderik
 */
@Path("partie")
public class PartieIHMResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ConnectResource
     */
    public PartieIHMResource() {
    }

    /**
     * Retrieves representation of an instance of WebService.ConnectResource
     * @param nomJoueur
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPartie() {
        
        InfoPartieDTO partieEnCour = AdaptateurPartie.getInstance().getInfoPartie();
        return Response.status(Response.Status.OK).entity(partieEnCour).build();
    }
}

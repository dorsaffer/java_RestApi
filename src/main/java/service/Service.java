package service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import entities.Evenement;



@Path("evenements")
public class Service {
	
	public static List<Evenement> listE =new ArrayList<>();
	
	
	@POST
	
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addEvenement(Evenement e) {
	
			listE.add(e);
		
		
		return(Response.status(Status.CREATED).entity(listE)).build();
		
		
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public Response getEvenement(@QueryParam(value="entreprise") String e) {
	
		
		
		for (Evenement evenement : listE) {
			if(evenement.getEntreprise().equals(e)) {
				return(Response.status(Status.OK).entity(e)).build();
			}
			
		}
		
	
		return(Response.status(Status.NO_CONTENT).entity("false")).build();
		
		
	}
	

	private Evenement getIndex(int id) {
		
		for(Evenement emp: listE) {
			if (emp.getId()== id)
				return emp;
		}
		return null; 
	}

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response updateEmploye(@PathParam("id") int id) {
		Evenement index= getIndex(id);
		if (index!= null) {
			index.setCapacite(900);
			
			return(Response.status(Status.ACCEPTED).entity(index)).build();
		}
			return(Response.status(Status.NOT_FOUND)).build();
	}
	
   /* @GET
	@Path("event")
	@Produces(MediaType.APPLICATION_XML)
	public Response getDashbo(@QueryParam(value="num") int num) {
    	Evenement e= new Evenement(2,"29-01-2020","cisco",300,"hotel Concord",false);
		if(num == 5) {
			
			return(Response.status(Status.OK).entity(e)).build();
		}
		
		return(Response.status(Status.NO_CONTENT).entity("false")).build();
		
		
	}*/

}

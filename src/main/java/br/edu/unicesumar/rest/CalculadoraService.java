package br.edu.unicesumar.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraService {
	@GET
	@Path("/teste/{param1}/")
	public Response HelloWord(@PathParam("param1") String pr1) {
		return Response.status(200).entity("Hello Word!!!! " + pr1).build(); 
	}
}

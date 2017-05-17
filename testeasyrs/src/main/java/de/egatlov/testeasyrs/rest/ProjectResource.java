package de.egatlov.testeasyrs.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/projects")
public class ProjectResource {

	@GET
	public Response getAll() {
		return Response.ok("Hello World").build();
	}

	@Path("/{projectName}")
	@GET
	public Response get(@PathParam("projectName") String projectName) {
		return null;
	}

	@Path("/{projectName}")
	@PUT
	public Response update(@PathParam("projectName") String projectName) {
		return null;
	}

	@Path("/{projectName}")
	@POST
	public Response create(@PathParam("projectName") String projectName) {
		return null;
	}

	@Path("/{projectName}")
	@DELETE
	public Response delete(@PathParam("projectName") String projectName) {
		return null;
	}

}

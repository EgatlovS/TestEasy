package de.egatlov.testeasyrs.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/projects")
public class CaseResource {

	@Path("/{projectName}/{caseName}")
	@GET
	public Response get(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName) {
		return null;
	}

	@Path("/{projectName}/{caseName}")
	@PUT
	public Response update(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName) {
		return null;
	}

	@Path("/{projectName}/{caseName}")
	@POST
	public Response create(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName) {
		return null;
	}

	@Path("/{projectName}/{caseName}")
	@DELETE
	public Response delete(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName) {
		return null;
	}

}

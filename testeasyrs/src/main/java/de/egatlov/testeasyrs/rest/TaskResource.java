package de.egatlov.testeasyrs.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/projects")
public class TaskResource {

	@Path("/{projectName}/{caseName}/{taskName}")
	@GET
	public Response get(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName,
			@PathParam("taskName") String taskName) {
		return null;
	}

	@Path("/{projectName}/{caseName}/{taskName}")
	@PUT
	public Response update(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName,
			@PathParam("taskName") String taskName) {
		return null;
	}

	@Path("/{projectName}/{caseName}/{taskName}")
	@POST
	public Response create(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName,
			@PathParam("taskName") String taskName) {
		return null;
	}

	@Path("/{projectName}/{caseName}/{taskName}")
	@DELETE
	public Response delete(@PathParam("projectName") String projectName, @PathParam("caseName") String caseName,
			@PathParam("taskName") String taskName) {
		return null;
	}

}

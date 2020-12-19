package com.jwt.rs;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloService {

	@GET
	@Path("/{n1}/{n2}")
	public Response getMsg(@PathParam("n1") int n1,@PathParam("n2") int n2) {
		
		String output="Sum:"+(n1+n2);
		
		return Response.status(200).entity(output).build();
	}
}
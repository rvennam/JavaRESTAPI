package my.calculator;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/calculator")
public class Calculator {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response calculate(@QueryParam("input") long input) {
		String json = "{'result':'"+ input*input +"'}";
		return Response.ok(json).build();
	}
}
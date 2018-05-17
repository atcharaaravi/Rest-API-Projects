package com.jersey.helloWorld;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/cts")
public class HelloJersey {
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		String message = "Hello from Jersey";
		return message;
	}
	
	@GET
	@Path("/{value}/{DF}")
	@Produces(MediaType.TEXT_PLAIN)
	public int degreeToFarenhiet(@PathParam("value") int value,@PathParam("DF") String DF){
		if(DF.equalsIgnoreCase("C")){
			value = ((value - 32)*5)/9;
		
		return value;
		}
		else if(DF.equalsIgnoreCase("F")){
			value=(9*(value/5)) + 32;
			return value;
		}
		else{
			return 0;
		}
	}
	
}


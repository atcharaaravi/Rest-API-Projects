package com.webservice.formparam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response; 
 
@Path("/student")
public class TestWS {		
 @POST
 @Path("/add")
 public Response addStudent(
  @FormParam("name") String name,
  @FormParam("rollNo") String rollNo) {	 
	String output = "Student Name: " + name + 
			", Roll No.: " + rollNo; 
	return Response.status(200).entity(output).build(); 
 }
}
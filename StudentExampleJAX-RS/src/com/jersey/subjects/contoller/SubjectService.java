package com.jersey.subjects.contoller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 





import com.jersey.subjects.pojo.Subject;
import com.jersey.subjects.service.SubjectDAO;

 
 

 
	@Path("/subjects")
	public class SubjectService {
	 
	    
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public List<Subject> getSubjects_JSON() {
	        List<Subject> listOfSubjects = SubjectDAO.getAllSubjects();
	        return listOfSubjects;
	    }
	 
	    
	    @GET
	    @Path("/{subjectID}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Subject getSubject(@PathParam("subjectID") String subjectID) {
	        return SubjectDAO.getSubject(subjectID);
	    }
	 
	    
	    @POST
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Subject addSubject(Subject sub) {
	        return SubjectDAO.addSubject(sub);
	    }
	 
	   
	    @PUT
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Subject updateSubject(Subject sub) {
	        return SubjectDAO.updateSubject(sub);
	    }
	 
	    @DELETE
	    @Path("/{subjectID}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public void deleteSubject(@PathParam("subjectID") String subjectID) {
	        SubjectDAO.deleteSubject(subjectID);
	    }
	}

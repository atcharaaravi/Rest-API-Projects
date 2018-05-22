package com.jersey.employee.controller;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.employee.service.EmployeeControllerService;
import com.jersey.employee.pojo.Employee;
@Path("/employee")
public class EmployeeController {
	
	EmployeeControllerService employeeControllerService = new EmployeeControllerService();
	
	@GET
	@Path("/getall")
    @Produces(MediaType.APPLICATION_JSON)
 public List getAllEmployees()
 {
  
  List listOfEmployees=EmployeeControllerService.getAllEmployees();
  return listOfEmployees;
 }
 
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public Employee getEmployeeById(@PathParam("id") int id)
 {
  return EmployeeControllerService.getEmployee(id);
 }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
 public Employee addEmployee(Employee employee)
 {
  return EmployeeControllerService.addEmployee(employee);
 }
 
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
 public Employee updateEmployee(Employee employee)
 {
  return EmployeeControllerService.updateEmployee(employee);
  
 }
 
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
 public void deleteEmployee(@PathParam("id") int id)
 {
    	EmployeeControllerService.deleteEmployee(id);
  
 }
}

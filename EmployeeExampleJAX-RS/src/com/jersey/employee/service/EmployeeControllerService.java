package com.jersey.employee.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.employee.pojo.Employee;

public class EmployeeControllerService {
	static HashMap<Integer,Employee> employeeIdMap=getEmployeeIdMap();
	 
	 
	 public EmployeeControllerService() {
	  super();
	 
	  if(employeeIdMap==null)
	  {
		  employeeIdMap=new HashMap<Integer,Employee>();
	  // Creating some objects of Employee while initializing
	   Employee oneEmployee=new Employee(1, "Atcharaa","ckc");
	   Employee secondEmployee=new Employee(2, "Narmu","ckc");
	   Employee thirdEmployee=new Employee(3,"Jayashree","tco");
	   Employee fourthEmployee=new Employee(4, "Vidhya","bgl");
	 
	 
	   employeeIdMap.put(1,oneEmployee);
	   employeeIdMap.put(4,secondEmployee);
	   employeeIdMap.put(3,thirdEmployee);
	   employeeIdMap.put(2,fourthEmployee);
	  }
	 }
	 
	 public static List getAllEmployees()
	 {
	  List countries = new ArrayList(employeeIdMap.values());
	  return countries;
	 }
	 
	 public static Employee getEmployee(int id)
	 {
	  Employee employee= employeeIdMap.get(id);
	  return employee;
	 }
	 public static Employee addEmployee(Employee employee)
	 {
	  employee.setEmpId(employeeIdMap.size()+1);
	  employeeIdMap.put(employee.getEmpId(), employee);
	  return employee;
	 }
	 
	 public static Employee updateEmployee(Employee employee)
	 {
	  if(employee.getEmpId()<=0)
	   return null;
	  employeeIdMap.put(employee.getEmpId(), employee);
	  return employee;
	 
	 }
	 public static void deleteEmployee(int id)
	 {
	  employeeIdMap.remove(id);
	 }
	 
	 public static HashMap<Integer, Employee> getEmployeeIdMap() {
	  return employeeIdMap;
	 }
}

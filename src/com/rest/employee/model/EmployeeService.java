package com.rest.employee.model;


import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import com.rest.employee.model.Employee;



@Path("/emp")
public class EmployeeService {
	
@GET
@Path("/get/{empID}/")
@Produces(MediaType.APPLICATION_JSON)
		public Employee getEmployee(@PathParam("empID") String empID, String email, String name){
	Employee employee = new com.rest.employee.model.Employee();
	employee.setEmpID(empID);
	
	employee.setName("Abinas Patra");
	employee.setEmail("2010abinas@gmail.com");
	return employee;
}


}




















package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface EmployeeService{
	void setEmployeeService(Employee employee);
}

public class EmployeeInsuranceSystem implements EmployeeService {


	@Override
	public void setEmployeeService(Employee employee) {

		if(employee.getSalary()>5000 && employee.getSalary()<20000)
		{
			employee.setDesignation("System Associate");
			employee.setInsuranceScheme("Scheme C");
		}
		else if(employee.getSalary()>=20000 && employee.getSalary()<40000)
		{
			employee.setDesignation("Programmer");
			employee.setInsuranceScheme("Scheme B");
		}
		else if(employee.getSalary()>=40000)
		{
			employee.setDesignation("Manager");
			employee.setInsuranceScheme("Scheme A");
		}
		else 
		{
			employee.setDesignation("Clerk");
			employee.setInsuranceScheme("No Scheme");
		}
		
	}

}
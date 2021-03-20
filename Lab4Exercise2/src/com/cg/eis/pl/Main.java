package com.cg.eis.pl;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

		public static void main(String[] args) {
			
			EmployeeServiceImpl  service = new EmployeeServiceImpl();
			service.fetchEmployeeDetails();
			service.display();
			Employee emp = service.employee;
			System.out.println("Insurance is : "+service.findInsuranceScheme(emp.getSalary(), emp.getDesignation()));
			
		}


}

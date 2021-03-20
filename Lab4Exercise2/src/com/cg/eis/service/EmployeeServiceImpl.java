package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public Employee employee;

	@Override
	public void fetchEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name: ");
		String name = sc.nextLine();

		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter designation : ");
		String designation = sc.nextLine();

		System.out.println("Enter insurance scheme :");
		String insuranceScheme = sc.nextLine();

		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setDesignation(designation);
		emp.setSalary(salary);
		emp.setInsuranceScheme(insuranceScheme);
		this.employee = emp;
	}

	@Override
	public String findInsuranceScheme(double salary, String designation) {
		Employee emp = this.employee;
		if (emp.getSalary() == salary && emp.getDesignation() == designation) {
			return emp.getInsuranceScheme();
		} else {
			return " not found ";
		}

	}

	@Override
	public void display() {
		Employee emp = this.employee;
		System.out.println("Id is : " +emp.getId());
		System.out.println("name is :" +emp.getName());
		System.out.println("salary is :"+emp.getSalary());
		System.out.println("Designation :"+emp.getDesignation());
		
	} 

}

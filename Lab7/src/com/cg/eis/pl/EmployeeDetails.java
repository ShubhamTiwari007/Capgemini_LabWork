package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.*;

public class EmployeeDetails {

	public static void main(String[] args) throws SchemeException {
		
		Scanner sc = new Scanner(System.in);
		int count=0;
		Map<Integer, Employee> hm = new HashMap<>();
		while(true)
		{
			System.out.println("1. Enter employee details");
			System.out.println("2. Print Employee details");
			System.out.println("3. Find by Scheme");
			System.out.println("4. Delete by Id");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the no of employees");
					int n = sc.nextInt();
					System.out.println("Enter the employee details");
					while(n!=0)
					{
						System.out.println("Enter ID");
						int id = sc.nextInt();
						System.out.println("Enter name");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("Enter salary");
						double salary = sc.nextDouble();
						Employee employee = new Employee(id, name, salary);
						EmployeeInsuranceSystem eis = new EmployeeInsuranceSystem();
						eis.setEmployeeService(employee);
						hm.put(++count, employee);
						n--;
					}
					break;
				
				case 2:
					if(!(hm.isEmpty()))
						hm.forEach((k,v)->System.out.println(k+" "+v));
					else
						System.out.println("No employees found in the database");
					break;
				case 3:
					System.out.println("Enter the Scheme");
					int employeeCount = 0;
					sc.nextLine();
					try {
						String scheme = sc.nextLine();
						if(scheme.equalsIgnoreCase("Scheme A") || scheme.equalsIgnoreCase("Scheme B") || scheme.equalsIgnoreCase("No Scheme")) {
							for(Map.Entry<Integer, Employee> m: hm.entrySet())
							{
								if(m.getValue().getInsuranceScheme().equalsIgnoreCase(scheme))
								{
									System.out.println(m);
									employeeCount++;
								}		
							}
							if(employeeCount==0)
								System.out.println("No employees under this scheme was found");
						}
						else
						{
							throw new SchemeException("Invalid Scheme");
						}
					}
					catch(SchemeException e) {
						System.out.println(e.getMessage());
					}
					break;
				case 4:
					System.out.println("Enter the id to be deleted");
					int toBeDeleted = sc.nextInt();
					for(Map.Entry<Integer, Employee> m: hm.entrySet())
					{
						if(m.getValue().getId() == toBeDeleted)
						{
							hm.remove(m.getKey());
							System.out.println("DELETED");
						}
					}
					break;
				default:
					System.out.println("INVALID CHOICE");
			}
		}
		
	}

}
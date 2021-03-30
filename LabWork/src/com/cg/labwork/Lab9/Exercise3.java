package com.cg.labwork.Lab9;

@FunctionalInterface
interface DemoInterface{
	boolean validateUser(String username, String password);
}

public class Exercise3 {
	public static boolean authorizeUser(String username, String password) {		
		DemoInterface obj = (name,pass) -> {
			if(username.equals(name) && password.equals(pass))
			{
				return true;
			}
			return false;
		};
		
		if(obj.validateUser("admin", "Pass123"))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		
		boolean result = Exercise3.authorizeUser("admin", "Pass123");
		if(result)
			System.out.println("Authorization Successful");
		else
			System.out.println("Invalid username or password");
	}
	

}

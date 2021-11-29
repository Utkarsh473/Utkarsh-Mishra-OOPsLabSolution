package com.greatlearning.appmain;
import com.greatlearning.model.Employee;
import com.greatlearning.service.*;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first Name");
		String firstName = in.next();
		
		System.out.println("Enter last Name");
		String lastName = in.next();
		
		System.out.println("Please enter department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int dept = in.nextInt();
		String departmentName = null;
		switch (dept)
		{
		case 1:
			departmentName = "Technical";
			break;
		case 2:
			departmentName = "Admin";
			break;
		case 3:
			departmentName = "Human Resources";
			break;
		case 4:
			departmentName = "Legal";
			break;
		}
		
		
		Employee employee = new Employee (firstName, lastName,departmentName);
		CredentialService credentialService = new CredentialService();
		String email = credentialService.generateEmailAddress(employee.getFirstName(),employee.getLastName(),employee.getDepartmentName());
		String pass = credentialService.generatePassword();
		credentialService.showCredentials(employee, email, pass);
		}
}

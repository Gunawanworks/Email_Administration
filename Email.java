package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	private String companySuffix = "binus.ac.id";
	
	
	//constructor to receive the name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//call private method asking which development is the user
		this.department = setDepartment();
		
		System.out.println("Department Code : " + this.department);
		
		//call a method that makes random password
		this.password = randomPassword(8);
		
		System.out.println("Your random password is : " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your New Email = " + email);
	}
	
	//asking for department
	private String setDepartment() {
		System.out.print("DepartmentCode : \n 1 for Sales\n 2 for Development \n 3 for Accounting\n 0 for none\n Enter Department Code : ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {
			return "Sales";
		}
		else if(deptChoice == 2) {
			return "Development";
		}
		else if(deptChoice == 2) {
			return "Accounting";
		}
		else {
			return "";
		}

	}
	
	
	//make a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
		
		char[] password = new char[length];
		
		for(int i=0 ; i < length ; i++) {
			int rand = (int) (Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand); 
		}
		String selesai = new String (password);
		return selesai;
	}
	
}

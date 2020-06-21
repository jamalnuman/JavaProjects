package emailapp;

import java.util.Scanner;

public class Email {
	//variable setup and have methods that will interact with these 
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int passwordLength = 8;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "numantech.com";
	
	//constructors to receive firstname and lastname and setting the department
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created for " + this.firstName + " " + this.lastName);
		
		//to get department code 
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		
		//to get random password
		this.password = setPassword(this.passwordLength);
		System.out.println("Your password is " + this.password);
		
		//turn this into method cause of the dot if 0 selected
		//System.out.println("Your email address is: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
	} 
	
	//setting the department code
	private String setDepartment() {
		System.out.print("Enter department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code:");
		Scanner scanner = new Scanner(System.in);
		int departChoice = scanner.nextInt();
		if (departChoice == 1) {return "Sales";}
		else if (departChoice == 2) {return "Development";}
		else if (departChoice == 3) {return "Accounting";}
		else { return "";} 
		
	}
	
	private String setPassword(int length) {
		String optionCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYX1234567890abcde!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			//Math.random return a random number btw 0-1, but we want it to be btw 0-optionCharacters.length and then 
			//casting it as a number and storing it in int random 
			int random = (int) (Math.random() * optionCharacters.length());
			password[i] = optionCharacters.charAt(random);
		}
		//modifying the array to a String
		return new String(password);	
	}
	
	//example of encapsulation
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//example of encapsulation
	public void setAlternateEmailAdress(String alternate) {
		this.alternateEmail = alternate;
	}
	
	//example of encapsulation
	public void setNewPassword(String newPassword) {
		this.password = newPassword;
	}
	
	//getters
	public String getPassword() {
		return this.password;
	}
	
	//getters
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	//getters
	public String getAlternateEmail() {
		return alternateEmail; 
	}
	
	public String showInfo() {
		return "YOUR NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
	
	
	//set mailbox capacity
	//set the alternate email
	//change the password method

}

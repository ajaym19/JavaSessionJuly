package Basics;

public class Employees {

	/*
	 * Types of Variables:
	 *  1. Global variables: variables declared within the class but outside of a method
	 *   a. Instance/Object Variables: global variables without static
	 *   b. Static/Class Variables: global variables with static
	 *  2. Local Variables: variables declared within the class and inside the method body
	 *  
	 * Types of Methods:
	 * 1. Instance Methods: if deals with instance variables
	 * 2. Static Methods: if deals with only static variables
	 */

	int empId;
	String empName;
	int empAge;
	String empDept;
	static String companyName = "Infosys";

	public void add() {
		int i = 12;
		System.out.println(i);
		System.out.println(empName);
	}

	public void subtract() {
		//System.out.println(i);
		System.out.println(empName);
		System.out.println(companyName);
	}
	
	public static void getCompanyName() {
		System.out.println(companyName);
		//System.out.println(empId);
	}
	
	public static void printCompanyPolicy() {
		System.out.println("Printing the policy");
	}
	
	

}

package ExceptionHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingDemo {
	/*
	 * DB coneection
	 * 
	 * try: read
	 * 
	 * ajay> aajy
	 * ayja >> aajy
	 * 
	 * catch: close the conection
	 *
	 * finally: close theconection
	 * 
	 * 
	 * try: everytime? yes
	 * catchL everytime? no, only if exception
	 * finally: everytime? yes
	 * 
	 * Checked: java is helping you at compile time
	 * Unchecked: java is not helping you
	 * 
	 * Code?
	 */
	

	public static void main(String[] args) {
		String filePath = "./src/FilehandlingDemo/TestData";
		try {
			System.out.println("I am in try block");
			System.out.println(5/0);
			FileReader reader = new FileReader(filePath);
			
		} catch (FileNotFoundException e) {
			System.out.println("I am in catch Block");
		} catch (Exception e) {
			// TODO: handle exception
		} 
		finally {
			System.out.println("Close the connection");
		}
		
		System.out.println("Hi");
		//System.out.println(5/0);
		//ArrayIndex out of bound exception
		//Nullpointer exception
		String name = null;
		System.out.println(name.length());
		
		//Apache POI>> excel
		//super and final
		
	}
}

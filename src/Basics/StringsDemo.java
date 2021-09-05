package Basics;

public class StringsDemo {

	public enum Seasons {
		Winter, Summer, Rainy
	};

	public static void main(String[] args) {
		/*
		 * String is a non primitive data type it is a class you can create object
		 * string class is immutable
		 */
		String name = "Ajay";

		int i;

		String name = "Sabya";
		System.out.println(name);
		name = name.concat("Trainer");
		String newName = "Ajay".concat("Hello");
		System.out.println(name);
		System.out.println(newName);
		System.out.println(name.length());

		StringBuffer buffer = new StringBuffer("Welcome");
		System.out.println(buffer);
		buffer.append(" to JAVA");
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.reverse());
		// 2 ways: 1 : in built method, loop
		Seasons abc = Seasons.Winter;
		System.out.println(abc);

		StringBuilder sb = new StringBuilder("AJay");
		//lenght and reverse
		
	}
	
	
	/*
	 * String name ="ajay
	 * another = yaja
	 * convert this to array of string
	 * for loop i = name.length
	 * store that vlaue to another variables but ai index 0
	 * 
	 * 
	 */
}

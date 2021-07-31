package Basics;

public class DataTypeConversion {

	public static void main(String[] args) {
		/*
		 * int id; long id; int salary; float salary;
		 * 
		 * salary = 45; salary = 45.10
		 * 
		 * Bucket Theory: 1. Bucket1 >> 5litres 2. Bucket2 >> 3litres Scenario1:
		 * transfer water from Bucket2 to bucket1 Scenario2: transfer water from Bucket1
		 * to bucket2
		 * 
		 * byte, short,int, long, float, double char String
		 */

		int i1 = 10;// bucket2
		float f1; // bukcet1
		f1 = i1;
		System.out.println(i1);
		System.out.println(f1);

		int i2;
		float f2 = 45.9f;
		i2 = (int) f2;
		System.out.println(f2);
		System.out.println(i2);

		// char to int>> ASCII Values
		char c1 = '2';
		int i3 = c1;
		System.out.println(c1); // 2
		System.out.println(i3); // 2

		char c2 = 'A';
		int i4 = c2;
		System.out.println(c2); // A
		System.out.println(i4); // A
		char c3 = (char) i4;
		System.out.println(c3);

		String s1 = "34";
		int i5;
		// wrapper method is class representative of primitive data type
		// int>> Integer
		System.out.println("Converting string to int");
		i5 = Integer.parseInt(s1);
		System.out.println(s1);
		System.out.println(i5);

		System.out.println("Converting int to String");
		String s2;
		int i6 = 101;
		s2 = Integer.toString(i6);
		System.out.println(i6 + 10); // 111
		System.out.println(s2 + 10); // 10110

		int i7 = 45;
		int i8 = 10;
		String s7 = "Ajay";
		String s8 = "Test";

		System.out.println(i7 + i8); // 55
		System.out.println(s7 + s8); // AjayTest
		System.out.println(i7 + i8 + s7); // 55Ajay
		System.out.println(s7 + i8 + i7); // ajay1045//ajay55/ajay4510
		System.out.println(s7 + s8 + i7); // AjayTest45

		// double to string
		double d1 = 54;
		Double.toString(d1);
		
		/*
		 * Conversion of all primitive data types
		 * Converison of all primitve to non-primitive
		 * Conversion of char to string and vice-versa 
		 */

	}
}

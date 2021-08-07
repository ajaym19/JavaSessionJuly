package Basics;

public class LoopingDemo {

	public static void main(String[] args) {
		// print numbers 1 to 10
		/*
		 * for (int i = 5; i < 11; i++) { // 0, Y, P, 1, Y, P, 2, Y, P, 10, P, 11, N
		 * System.out.println(i); }
		 * 
		 * int j = 100; System.out.println("Learning while loop"); while (j <= 10) {
		 * System.out.println(j); j++; }
		 * 
		 * System.out.println("Learning dowhile"); int k = 9; do {
		 * System.out.println(k); k++; //9, P, 10, P, 11 } while (k < 11);
		 * 
		 * 
		 */

		// print 1 t 10,
		// if you find 7, print hello
		// if you find 9 print java
		// else print welcome
		/*
		 * for(int i =1; i < 11; i++) { System.out.println(i); if(i == 7) {
		 * System.out.println("Hello"); }else if(i == 9){ System.out.println("JAVA");
		 * }else { System.out.println("Welcome"); } }
		 */

		/*
		 * // print day name based on value // 1-Monday, 2 Tue, ...... int day = 40;
		 * switch (day) { case 1: System.out.println("Monday"); break; case 2:
		 * System.out.println("Tuesday"); break; case 3:
		 * System.out.println("Wednesday"); break; case 4:
		 * System.out.println("Thursday"); break; default:
		 * System.out.println("Enter number bewteen 1-7"); }
		 */

		// print 1 to 10;
		// if you find 5 stop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

	}
}

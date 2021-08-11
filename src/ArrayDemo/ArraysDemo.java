package ArrayDemo;

public class ArraysDemo {

	/*
	 * Array:
	 * we store similar multiple elements
	 * Array:
	 * 1. Declaration
	 * 2. Instantiation
	 * 3. Initialization
	 * 
	 * Notes:
	 * It is compulsory to give the size of array
	 * Each element is given an index
	 * Indexing starts from 0
	 * Maximum index would be size -1
	 * default value for each element for int is 0;
	 * 
	 * Disadvantages:
	 * size is fixed
	 */
	
	public static void main(String[] args) {
		int id; //declaration
		id = 5; //init
		
		//Approach1
		//declaration
		int studentId[];
		
		//instantiation- creating an object
		studentId = new int[6];
		
		//initiaization
		studentId[3] = 50;
		System.out.println(studentId[0]);
		System.out.println(studentId[3]);
		
		
		//Approach 2
		//declaration and instantiation at same time
		int[] teacherID = new int[3];
		teacherID[2] = 101;
		System.out.println(teacherID[2]);
		
		
		//Approach 3
		//declaration and instantiation and init
		int[] parentId = {21,22,23};
		System.out.println(parentId[1]);
		
		//looping
		
		
		
	}
}

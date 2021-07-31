package OOPS;

public class OOPSNotes {

	/*
	 * OOPS:
	 * it a paradigm consisting of many features
	 * there are 4 main pillars of OOPS
	 * 1. Inheritance
	 * 2. Polymorphism
	 * 3. Abstraction
	 * 4. Encapsulation
	 * 
	 * 
	 * Inheritance: reusability
	 * we use extends keyword to define the relationship
	 * generic
	 * Parent: 2 flats
	 * child : 2 flats
	 * add more flats
	 * modify the existing flat
	 * 
	 * student is 2 pm
	 * staff 10 classees time is 2.30 pm
	 * without Inheritance
	 * 100 classes
	 * 2 common methods
	 * 1 method of 10 lines
	 * methods? >> 200
	 * LOC? >> 2000
	 * 
	 * with Inheritance:
	 * Parent Class:
	 * 2 methods in PC
	 * 100 classes make them Child
	 * 
	 * methods: 2
	 * LOC: 20
	 * 
	 * PC:
	 * c1
	 * c2
	 * c3
	 * c4
	 * c5
	 * 
	 * Polymorphism: multiple/many forms
	 * one object/method but with multi0ple forms
	 * can be achieved 2 ways:
	 * 1. Compile Time: >> Static >>  Method Overloading
	 * 2. Run Time: >> Dynamic >> Method Overriding
	 * 
	 * Method Overloading can be achieved in 2 ways
	 * 1. By changing the number of parameters
	 * 2. By chaning the data type
	 * Note:By changing the return type you cannot achieve
	 * 
	 * 
	 * Flow of execution
	 * 1. Check the object is of which class
	 * 2. Go to that class
	 * 3. Check if method is present
	 * 4. If present, execute and stop
	 * 5. If not present, go to parent class
	 * 6. Keep on repeating
	 * 
	 * how to call a parent class overriden method
	 * 
	 */
	
	public static void main(String[] args) {
		ParentClass parent = new ParentClass();
		parent.eat();
		Students students = new Students();
		students.doStudy();
		Teachers teachers = new Teachers();
		teachers.conductLectures();
		students.eat();
		teachers.eat();
		System.out.println("Learning Method Overriding");
		students.exitTime();
		teachers.exitTime();
		parent.exitTime();
		System.out.println("Learning Method Overloading");
		students.sum(10, 20);
		students.sum(1, 2, 3);
		students.sum(10.5f, 11.7f);
		
		
		
	}
}

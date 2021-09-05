package InheritanceAndPolymorphism;

public class Students extends ParentClass {

	int id= 10;
	
	public Students() {
		super();
	}
	
	public static void main(String[] args) {
		Students obj = new Students();
		obj.printId();
	}
	
	public void printId() {
		super.printId();
		System.out.println(id);
	}
	public void doStudy() {
		System.out.println("Students are studying");
	}
	
	public void doExercise() {
		System.out.println("Exercise Time");
	}
	
	
	
	public void sum(int a, int b, int c) {
		System.out.println("Adding 3 int numbers");
	}
	
	public void sum(int a, int b, int c, int d) {
		System.out.println("Adding 4 int numbers");
	}
	
	public void sum(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void sum(float a, float b) {
		System.out.println("Adding 2 float numbers");
	}
	
	
	
	public static void main(String args) {
		System.out.println(2);
	}
	
	public static void main(int args) {
		System.out.println(3);
	}
	
	
	
	
	
	
	
	
}

package InheritanceAndPolymorphism;

public class ParentClass {

	int id = 5;
	
	public ParentClass() {
		System.out.println("I am in parent class Constructor and being called using super");
	}
	
	public void printId() {
		System.out.println(id);
	}
	
	public void eat() {
		System.out.println("Eating Time");
	}
	
	public void markAttendance() {
		System.out.println("Marking Attendance");
	}
	
	public final void exitTime() {
		System.out.println("Leaving time is 2 pm");
	}
}

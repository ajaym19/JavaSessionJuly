package Encapsulation;

public class Application {

	public static void main(String[] args) {
		Students obj = new Students();
		obj.setName("Ajay");
		System.out.println(obj.getName());
		System.out.println();
		System.out.println(obj.id1);
		//obj.finalvariable = 45;
		System.out.println(obj.finalvariable);
		//Math.PI = 5;
		System.out.println(Math.PI);
	}
}

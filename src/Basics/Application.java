package Basics;

public class Application {

	public static void main(String[] args) {
		//how to create object
		Students student1 = new Students(1, "Ajay");
		HelloWorld hw = new  HelloWorld();
		//student1.studentId = 3;
		student1.studentAge = 15;
		System.out.println(student1.studentAge);
		student1.doExercise();
		student1.giveExams();
		Students student2 = new Students(2, "Test");
		
		student2.studentAge= 4;
		System.out.println(student1.studentAge);
		System.out.println(student2.studentAge);
		System.out.println(student1.studentName);
		System.out.println();
		System.out.println("Learning Instance and Static");
		Employees emp1 = new Employees();
		emp1.empName = "Ajay";
		emp1.companyName = "Infosys";
		System.out.println(emp1.companyName); //IN
		
		Employees emp2 = new Employees();
		emp2.empName = "Yogesh";
		System.out.println(emp1.companyName); //IN
		System.out.println(emp2.companyName); //IN
		emp2.companyName = "TCS";
		
		System.out.println(emp1.empName); //Ajay
		System.out.println(emp1.companyName); //IN
		System.out.println(emp2.empName); //Yogesh
		System.out.println(emp2.companyName); //TCS
		System.out.println(emp1.companyName);//Infosys
		System.out.println(Employees.companyName);
		Employees.getCompanyName();
		
		//PIE = 3.14
		System.out.println(Math.PI);
	}
}

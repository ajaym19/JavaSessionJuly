package Basics;

public class Students {

	public Students(int studentId, String studentName) {
		//why we use this keyword
		//types of variables and methods
		
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	int studentId = 6;
	String studentName;
	int studentAge;
	String studentAddress;
	int studentPhoneNumber;
	
	
	public void doHomework() {
		System.out.println("Students are doing Homework");
		System.out.println(studentId);
	}
	
	public void doExercise() {
		System.out.println("Students are exercising");
	}
	
	public void giveExams() {
		int studentId = 101;
		System.out.println(studentId);
		System.out.println(this.studentId);
		System.out.println("Students are giving exams");
		
	}
	
	public static void main(String[] args) {
		 Students obj = new Students();
		  obj.giveExams();
	}
}

package Encapsulation;

public class Students {

	final int finalvariable = 5;
	private int id; // see? no, update? no
	private String name; // see? yes, update? yes
	private String dept; // see? yes, update > yes
	private String division; // see? yes, update > yes
	private int rollNo; // see? yes..update>> no
	int id1;
	protected int id2;
	public int id3;

	// getters and setters
	// dept: comp, it, electrical, mechanical, civil
	// circus
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// code to check if the update is as per the standard
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		// check it the update value is one of the allowed values
		this.dept = dept;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public int getRollNo() {
		return rollNo;
	}

}

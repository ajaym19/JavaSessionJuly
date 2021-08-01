package InheritanceAndPolymorphism;

public class Teachers extends ParentClass {

	public void conductLectures() {
		System.out.println("Conducting Lectures");
	}

	@Override
	public void exitTime() {
		System.out.println("Exit time is 2.30 pm");

	}

}

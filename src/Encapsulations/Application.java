package Encapsulations;

public class Application {

	public static void main(String[] args) {
		Bank obj = new Bank();
		//RBI objInterface = new Bank();
	//	objInterface.creditMoney();
		obj.creditMoney();
		obj.termDeposit();
		//WebDriver driver = new WebDriver();
		//WebDriver driver = new ChromeDriver();
	
		AbstractDemo objdemo = new Bank();
		objdemo.m1();
		
	}

}

package Abstraction;

import InheritanceAndPolymorphism.ParentClass;

public class Bank extends AbstractDemo implements RBI, SEBI {

	@Override
	public void creditMoney() {
		System.out.println("I am in credit Money");
	}

	@Override
	public void depositMoney() {
		System.out.println("I am in deposit Money");
	}

	@Override
	public void giveInterest() {
		System.out.println("I am giving 6% Interest");
	}
	
	public void termDeposit() {
		System.out.println("I am in term deposit");
	}

	@Override
	public void trading() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		System.out.println("I am in m2");
		
	}
}

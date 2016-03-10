package com.acadglid.java.core.session5.assignment4;

public class TestBankInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank bank=new Bank();
SbiBank sbiBank=new SbiBank();
ICICIBank icici=new ICICIBank();
AxisBank axisBank=new AxisBank();
System.out.println("interest is " +bank.getRateOfInterest());
System.out.println("Interest is " + sbiBank.getRateOfInterest());
System.out.println("ICIC interest is: "+icici.getRateOfInterest());
System.out.println("Axis Bank interest is: "+axisBank.getRateOfInterest());
	}

}

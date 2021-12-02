package com.test.epam.corejava;

abstract class RBI {

	public abstract void getHomeLoanInterest();
}

class ICICI extends RBI {

	@Override
	public void getHomeLoanInterest() {

		System.out.println("Home loan Interest Rate in ICICI is 7.2");
	}

}

class HDFC extends RBI {

	@Override
	public void getHomeLoanInterest() {

		System.out.println("Home loan Interest Rate in HDFC is 6.9");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

		ICICI objICICI = new ICICI();
		HDFC objHDFC=new HDFC();
		
		objICICI.getHomeLoanInterest();
		objHDFC.getHomeLoanInterest();

	}

}

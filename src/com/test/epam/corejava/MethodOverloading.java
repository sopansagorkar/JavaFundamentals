package com.test.epam.corejava;

class Mathematics {

	public void add(int a, int b) {
		int c = a + b;

		System.out.println("Sum of two integer numbers is = " + c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;

		System.out.println("Sum of three integer numbers is = " + d);
	}

	public void add(double a, double b) {
		double c = a + b;

		System.out.println("Sum of two double numbers is = " + c);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Mathematics mathematics = new Mathematics();
		mathematics.add(2, 3);
		mathematics.add(2.3, 8.5);
		mathematics.add(3, 5, 7);

	}

}

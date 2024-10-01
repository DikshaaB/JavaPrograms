package project;

public class MethodOverloading {

	static void addition(double a, double b) {

		double sum = a + b;
		System.out.println("sum of a and b is " + sum);
	}

	static void addition(int a, int b) {

		int sum = a + b;
		System.out.println("sum of a and b is " + sum);
	}
	
	static void addition(int a, double b) {

		double sum = a + b;
		System.out.println("sum of a and b is " + sum);
	}
	static void addition(double a, int b) {

		double sum = a + b;
		System.out.println("sum of a and b is " + sum);
	}

	public static void main(String[] args) {
		
		addition(10.989,22.220);
		addition(32,46);
		addition(100,11.11);
		addition(21.21,200);
	}

}

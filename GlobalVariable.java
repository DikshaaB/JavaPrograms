package project;

public class GlobalVariable {
	static int a=100;				//global variables
	static int b=200;				//global variables
	static String name;
	static double pi;

	public static void main(String[] args) {
		int c=90;				//local variables
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(name);
		System.out.println(pi);
	}

}

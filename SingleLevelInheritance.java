package project;

class ParentClass {

	static void add() {

		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println("Sum of a and b is: "+sum);
	}

	static void sub() {

		int a = 400;
		int b = 200;
		int sub = a - b;
		System.out.println("subtraction of 2 number is: "+sub);
	}
}

public class SingleLevelInheritance extends ParentClass {
	static void mul() {

		int a = 4;
		int b = 2;
		int mul = a *b;
		System.out.println("multiplication of 2 number is: "+mul);
	}
	
	static void div() {

		int a = 4;
		int b = 2;
		int div = a/b;
		System.out.println("division of 2 number is: "+div);
	}
	public static void main(String[] args) {
		div();
		mul();
		add();
		sub();
	}

}

package project;

class Parent1 {
	void add() {

		int a = 10;
		int b = 70;
		int sum = a + b;
		System.out.println("Sum of a and b is: " + sum);
	}

	void sub() {

		int a = 10;
		int b = 2;
		int sub = a - b;
		System.out.println("subtraction of 2 number is: " + sub);
	}

}

public class SingleInheritance1 extends Parent1 {
	void mul() {

		int a = 40;
		int b = 2;
		int mul = a * b;
		System.out.println("multiplication of 2 number is: " + mul);
	}

	void div() {

		int a = 7;
		int b = 7;
		int div = a / b;
		System.out.println("division of 2 number is: " + div);
	}

	public static void main(String[] args) {
		SingleInheritance1 s1 = new SingleInheritance1();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
	}

}

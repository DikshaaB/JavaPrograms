package project;

class Reporting {
	Reporting(int a) {

		System.out.println("reporting");
	}
}

class Screenshot extends Reporting {

	Screenshot(int a, String b) {
		super(20);
		System.out.println("screenshot");
	}
}

public class TestCase1 extends Screenshot {
	TestCase1() {
		super(10, "abc");
		System.out.println("testcase1");
	}

	public static void main(String[] args) {

		new TestCase1();
	}

}

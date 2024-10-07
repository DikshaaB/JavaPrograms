package project;

class Login {
	Login() {
		
		System.out.println("login");
	}
}

class Registration extends Login {
	Registration() {
		super();
		System.out.println("registration");
	}
}

class Logout extends Registration {
	Logout() {
		super();
		System.out.println("logout");
	}
}

public class TestCase extends Logout {
	TestCase() {
		super();
		System.out.println("testcase");
	}

	public static void main(String[] args) {
		new TestCase();
	}

}

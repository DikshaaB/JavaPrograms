package project;

class Parent {
	static void add() {

		System.out.println("Addition");
	}
}

class ParentTwo extends Parent {
	void sub() {

		System.out.println("subtraction");
	}
}

class ParentThree extends ParentTwo {
	static void mul() {
		System.out.println("multiplication");
	}
}

public class MultiLevelInheritance extends ParentThree {
	void div() {
		System.out.println("division");
	}

	public static void main(String[] args) {
		add();
		mul();
		MultiLevelInheritance m1 = new MultiLevelInheritance();
		m1.div();
		m1.sub();
	}

}

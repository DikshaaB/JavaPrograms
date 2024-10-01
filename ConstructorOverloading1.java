package project;

public class ConstructorOverloading1 {
	
	ConstructorOverloading1(){
		System.out.println("1st");
	}
	
	ConstructorOverloading1(int a){
		System.out.println("2nd");
	}
	
	ConstructorOverloading1(int a,float b){
		System.out.println("3rd");
	}

	public static void main(String[] args) {
		new ConstructorOverloading1();
		
		new ConstructorOverloading1(10);
		new ConstructorOverloading1(100,11.07f);


	
	}

}

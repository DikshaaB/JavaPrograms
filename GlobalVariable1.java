package project;

public class GlobalVariable1 {

	
//	static boolean answer;
	static int a=100;
	int b=80;
	public static void main(String[] args) {
//	answer=true;
//	System.out.println(answer);
		
		System.out.println(a);
		GlobalVariable1 g1=new GlobalVariable1();
		g1.b=85;
		System.out.println(g1.b);
	}

}

package project;

import java.util.Scanner;

public class AreaOfSquare {

	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=s1.nextInt();
		int area=a*a;
		System.out.println("area of square is:"+area);
	}
}

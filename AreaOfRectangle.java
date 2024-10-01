package project;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println("enter the value of length:");
		int l=s1.nextInt();
		
		System.out.println("enter the value of breadth:");
		int b=s1.nextInt();
		
		int area=l*b;
		System.out.println("area of rectangle is:"+area);
	}

}

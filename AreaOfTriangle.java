package project;

import java.util.Scanner;

public class AreaOfTriangle {
public static void main(String[] args) {
	
	
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the value of breadth: ");
	double b=s1.nextDouble();
	
	System.out.println("enter the value of height: ");
	double h=s1.nextDouble();
	
	double area=0.5*b*h;
	System.out.println("Area of triangle is:"+area);
}
}

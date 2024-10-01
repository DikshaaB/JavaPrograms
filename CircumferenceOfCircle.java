package project;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the value of pi:");
	double pi=s1.nextDouble();
	
	System.out.println("enter the value of r:");
	double r=s1.nextDouble();
	double area=2*pi*r;
	System.out.println("circumference of circle is: "+area);
	}

}

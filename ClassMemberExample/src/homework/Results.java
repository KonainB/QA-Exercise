package homework;

import java.util.Scanner;

public class Results {
	public static Scanner sc;
	public static void main(String[] args) 
	{
		int chemistry, biology, physics; 
	    float total, Percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter your Chemistry Marks : ");
		chemistry = (sc.nextInt());        
		System.out.print(" Please Enter your Biology Marks : ");
		biology = sc.nextInt();
		System.out.print(" Please Enter your Physics Marks : ");	
		physics = sc.nextInt();	
		
		System.out.println("Your final score is " + (chemistry+biology+physics) + " out of 450");
		
		total = chemistry + biology + physics;
	    Percentage = (total * 100) /450;
	    System.out.println("Your overall percentage for the exam is  " + Percentage + "%");

}}

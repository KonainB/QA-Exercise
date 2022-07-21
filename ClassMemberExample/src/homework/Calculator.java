package homework;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);   
		System.out.println("Enter the first number "); 
		int a = Input.nextInt(); 
		System.out.println("Enter the second number ");
		int b = Input.nextInt();
	    Input.close();  
	    System.out.println(a + " + " + b + " = " + (a + b));
	    System.out.println(a + " - " + b + " = " + (a - b));
	    System.out.println(a + " x " + b + " = " + (a * b));    		   
	    System.out.println(a + " / " + b + " = " + (a / b));
	    double r = (double) a / b;
	    System.out.println(r);
	
	    
	    
	    } 
	 
	}  



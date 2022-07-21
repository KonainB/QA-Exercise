package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scanner.next();
		System.out.println("Hello "+name);
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		System.out.println("You are "+age+ " years old");
		System.out.println("Hello "+name+"!! You are "+age+" years old.");

	}

}

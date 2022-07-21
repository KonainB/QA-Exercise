package org;

import java.util.Scanner;

public class TestJDBSOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		JDBCOperation ops = new JDBCOperation();
        char ans='y';
		System.out.println("Hello welcome to my application");
		System.out.println("------------------------------");
		System.out.println("What would you like to do? please enter a number");
		System.out.println("1.Read Records");
		System.out.println("2.Add record");
		System.out.println("3.Update Record");
		System.out.println("4.Quit");
		///while(ans){
		int choice = scn.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Good choice- reading records");
			ops.readData();
			break;
		case 2:
			System.out.println("Good choice- add record");
			ops.addData();
			break;
		case 3:
			System.out.println("Good choice- update record");
			ops.UpdateData();
		case 4:
			System.out.println("Quitting...");
			break;
		default:
			System.out.println("Enter correct choice");
		//sysout(do you want to continue)
		//ans=scn.nextChar();
		//}	
		}
	}
}
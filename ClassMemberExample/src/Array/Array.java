package Array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int[][]num1=new int[3][3];
		int[][]num2=new int[3][3];
		System.out.println("Enter the values for array num1");
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				num1[i][j]=scn.nextInt();
			}
		}	
			System.out.println("Enter the values for array num2");
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					num2[i][j]=scn.nextInt();
				}
		}	   
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		num1[i][j]=num1[i][j]+num2[i][j];
	    	}
	    }	
	    for(int i=0;i<3;i++)
	 	{
	 	    	for(int j=0;j<3;j++)
	 	    	{
	 	    		System.out.println(num1[i][j]+" ");
	 	    	}
	 	    	System.out.println();
	    	}
	    }
				
	    }
	


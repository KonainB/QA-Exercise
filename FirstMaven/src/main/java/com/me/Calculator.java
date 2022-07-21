package com.me;

public class Calculator {
	//unit1
	public static int findBig(int x, int y)
	{
		if(x>y)
			return x;
		else
			return y;
	}
	
	public static int findBiggest(int a, int b, int c) 
	{
		if(a>b && b>c)
			return a;
		else if (b>a && a>c)
			return b;
		else 
			return c;	
	}
	
	public static int checkCCNum(String ccNum)
	{
		int ccLength=ccNum.length();
		return ccLength;
			
	}
	public static int findMax(int nums []) {
		int max=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if(max<nums[i])
			{
				max=nums[i];
			}
		}
		return max;
		}
	
}




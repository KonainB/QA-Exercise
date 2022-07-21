package org;

public class Conditons {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=5;
		if(x>y && y<z)
		{
			System.out.println("x is biggest");
		}else if (y>x && x>z) {
			System.out.println("y is biggest");
		}
		else 
			System.out.println("z is biggest");
	}

}

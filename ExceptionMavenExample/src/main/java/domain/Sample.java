package domain;

public class Sample {
	public void method1() //handling the exception
	{   try {
		int x=10;
		int y=10;
		int z=x/y;
	}catch(Exception e) {
		System.out.println("Something went wrong");
	}
	}
	
	public void method2()throws Exception //declaring the exception
	{
		int x=10;
		int y=10;
		int z=x/y;
	}

}

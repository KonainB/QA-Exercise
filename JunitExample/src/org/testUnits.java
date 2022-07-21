package org;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class testUnits {
	@Test
	public void checkfindBig()
	{
	   assertEquals(20, Calculator.findBig(10,20));
	}

	@Test
	public void checkfindBiggest()
	{
		assertEquals(30, Calculator.findBig(20,30));
		assertEquals(50, Calculator.findBig(10,50));

	}
	
	@Test
	public void checkccLength()
	{
		assertEquals(16, Calculator.checkCCNum("1234567891234567"));
}
	
	@Test
	public void findMax()
	{
		int[]x= {100,200,300,400,3,400,6,20};
		assertEquals(400, Calculator.findMax(x));
    }
}
	

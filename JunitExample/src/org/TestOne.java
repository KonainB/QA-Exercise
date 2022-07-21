package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOne {
	@Test
	public void checkfindBiggest()
	{
		assertEquals(30, Calculator.findBig(20,30));
		assertEquals(50, Calculator.findBig(10,50));

	}

}

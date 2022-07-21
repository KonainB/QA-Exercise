package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTwo {
	@Test
	public void checkfindBig()
	{
	   assertEquals(20, Calculator.findBig(10,20));
	}

}

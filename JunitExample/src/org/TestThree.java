package org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestThree {
	@Test
	public void checkccLength()
	{
		assertEquals(16, Calculator.checkCCNum("1234567891234567"));
}

}

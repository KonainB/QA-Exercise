package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotation {
	private ArrayList<String> list;
	@BeforeClass //before all the test classes/ should be static
	public static void ml()
	{
		System.out.println("@BeforeClass");
	}
	
	@Before  //before each test
	public void m2()
	{
		list=new ArrayList<String>();
		System.out.println("@Before");
	}
	
	@After //after each test
	public void m3()
	{
		System.out.println("@After");
	}
	
	@AfterClass //after all test classes/ should be static
	public static void m4()
	{
		System.out.println("@AfterClass");
	}
	
	@Ignore //not to be tested
	public void m5()
	{
		System.out.println("This is ignored");
	}	
	
	@Test
	public void m6()
	{
		list.add("Konain");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
	}
	
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


}

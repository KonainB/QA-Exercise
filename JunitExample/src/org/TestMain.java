package org;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("How are you");
		Result result=JUnitCore.runClasses(testUnits.class);
		for(Failure fail:result.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println("Result ="+result.wasSuccessful());		
	}

}

package com;

public class Test {
	public static void main(String[] args) {
		Eligibility obj=new Eligibility();
		try {
			obj.checkEligibility(15);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		ValidCC obj1=new ValidCC();
		try {
			obj1.checkValidity("1234567812345678");
		}catch (ValidCCException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

package com;

public class Eligibility {
	public void checkEligibility(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("You are not allowed to vote");
		else 
			System.out.println("Please cast your vote");
	}

}

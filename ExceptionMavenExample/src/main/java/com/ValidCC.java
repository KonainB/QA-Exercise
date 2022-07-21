package com;

public class ValidCC {
	public void checkValidity(String ccNo) throws ValidCCException
	{
		if (ccNo.length()!=16)
		{
			throw new ValidCCException("Invalid CC no");
		}
		else System.out.println("Please make the payment");
	}
}


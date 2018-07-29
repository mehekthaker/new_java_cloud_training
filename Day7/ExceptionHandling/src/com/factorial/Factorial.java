//defines the factorial logic alongwith the exceptions

package com.factorial;

public class Factorial {
	long fact=1;
	int getFactorial(int number) throws InvalidInputException, FactorialException{
		if(number<2)
		{
			throw new InvalidInputException("Number cannot be less than 2");
		}
		for(int i=1; i<=number; i++)
			fact=fact*i;
		if(fact > 2_147_483_647 || fact<=0)
			throw new FactorialException("Factorial cannot be more than 2,147,483,647");
		
		return (int)fact;
	}
	
}

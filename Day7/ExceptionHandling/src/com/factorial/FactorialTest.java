/*write a class Factorial which has service method int getFactorial(int num) which returns the factorial of a number num.

if the number given by the user is less than  2 then throw InvalidInputException.

find what is the highest value of int and if the factorial answer exceeds the highest value  then throw FactorialException to the caller.*/

package com.factorial;

import java.util.Scanner;

public class FactorialTest {
	
	public static void main(String args[])
	{
		Factorial factorial = new Factorial();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = scanner.nextInt();
		
		try 
		{
			int fact = factorial.getFactorial(number);
			System.out.println("The factorial of "+number+" is "+fact);
		}
		catch(InvalidInputException iie) 
		{
			iie.printStackTrace();
		}
		catch(FactorialException fe) 
		{
			fe.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}

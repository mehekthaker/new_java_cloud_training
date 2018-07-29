//Exception is created for a number whose factorial is greater than the highest value of int

package com.factorial;

public class FactorialException extends Exception {

	public FactorialException(String message) {
		super(message);
	}
	
}

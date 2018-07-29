//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

import java.util.*;

public class Palindrome {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		int temp, reverse_num=0;
		
		temp = number;
		
		while (temp > 0) {
			int remainder = temp % 10;
			reverse_num = reverse_num * 10 + remainder;
			temp = temp / 10;		
		}//reverses the digits in the number
				
			if (number == reverse_num) {
				System.out.println("The number entered is palindrome");
			} 
			else
				System.out.println("The number entered is not palindrome");
		//Checks whether the number after reversing is the same as before
	}
}

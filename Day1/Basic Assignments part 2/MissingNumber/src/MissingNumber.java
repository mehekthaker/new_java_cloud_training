/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.*/

import java.util.*;

public class MissingNumber {
	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int number = scanner.nextInt();
		int arr[] = new int[number];
		int total=0, arr_tot=0;
		System.out.println("Enter the elements of array");
		for(int i=0; i<number-1; i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0; i<number; i++)
		{
			total=total+i;
		//	arr_tot = arr_tot+arr[i];

			//		System.out.println("Missing number is "+Math.abs(total-arr_tot));
				//	break;
		
		}
		for(int i=0; i<number-1; i++)
		{
			arr_tot=arr_tot+arr[i];
		
		}
			System.out.println("Missing number is "+Math.abs(total-arr_tot));
		
		
	}

}

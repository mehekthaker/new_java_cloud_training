//Write a program to find if a particular element is present in a multi-dimensional array.

import java.util.*;
class MultidimensionalSearch
{
	public static void main(String args[]){
		int flag=0;
		Scanner scanner = new Scanner(System.in);
				
		int arr[][] = new int[3][3];
		
		System.out.println("Enter the element to be searched ");
		int number = scanner.nextInt();
		
		System.out.println("Enter the elements ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		
		//Searching for the element in two dimensional array
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(number == arr[i][j])
				{
					flag=1;
					System.out.println("Number found");
				}	
			}
		}
		if(flag == 0)
		{
			System.out.println("Number not found");
		}
	}
}	
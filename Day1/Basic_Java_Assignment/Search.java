//Searching for a particular number in an array

import java.util.*;
class Search{
	public static void main(String args[]){
		int arr[]=new int[15];
		int i, flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be searched");		
		int number = sc.nextInt();

		System.out.println("Enter the elements of the array");
		for(i=0;i<15;i++){
			arr[i]=sc.nextInt();
		}
		
		//Searching the entered element in the array
		for(i=0;i<15;i++){
			if(number==arr[i])
			{
				flag=1;
				System.out.println("Number found in the array");
			}
		}
		if(flag==0){
			System.out.println("Number not found");
		}
		
	}
}
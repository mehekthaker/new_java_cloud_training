//Sorting the array using bubble sort logic
import java.util.*;
class BubbleSort{
	public static void main(String args[]){
		int arr[]=new int[15];
		int i, j;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements of the array");
		for(i=0;i<15;i++){
			arr[i]=sc.nextInt();
		}
		
		//Sorting the array using bubble sort
		for(i=0;i<15;i++){
			for(j=0;j<15-i-1;j++){
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		
		}
		
		//Displaying the sorted array
		System.out.println("Sorted elements of the array are ");
		for(i=0;i<15;i++){
			System.out.println(arr[i]);
		}
		
	}
}
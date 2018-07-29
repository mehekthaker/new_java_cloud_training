/*Write a program to accept an array of names and a name and check whether the name is present in the array. Return the count of occurrence. 
Use the following array as input{“Dave”, “Ann”, “George”, “Sam”, “Ted”, “Gag”, “Saj”, “Agati”, “Mary”, “Sam”, “Ayan”, “Dev”, “Kity”, 
“Meery”, “Smith”, “Johnson”, “Bill”, “Williams”, “Jones”, “Brown”, “Davis”, “Miller”, “Wilson”, “Moore”, “Taylor, “Anderson”, “Thomas”, “Jackson”}*/

import java.util.*;

public class NameOccurence {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		String[] str = new String[] {"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan",
				"Dev", "Kitty", "Mary", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
				"Taylor", "Anderson", "Thomas", "Jackson"};
		System.out.println("Enter a name");
		String name = scanner.nextLine();
		int count=0, flag=0;
		for(int i=0; i<28; i++)
		{
			if(name.equals(str[i])) 
			{
				flag=1;
				count++;
			}
		}
		if(flag==1)
		{
			System.out.println("Name found and the count is "+count);	//displays name and count for that name entered
			
		}	
	}

}

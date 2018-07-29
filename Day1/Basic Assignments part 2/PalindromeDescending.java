/*Take 10 inputs
Identify a Palindrome
Count the chars in it
And sort in descending order of chars*/

import java.util.*;
class PalindromeDescending
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
	
		String string[] = new String[10];
		String reverse[] = new String[10];	
		int pos[] = new int[10];
		int size[] = new int[10];
		int id = 0;
		int temp = 0;
	
	
		System.out.println("Enter 10 input strings");
		for(int i=0; i<10; i++)
		{
			string[i] = scanner.nextLine();		//10 inputs
			reverse[i] = "";
			for(int j=string[i].length()-1; j>=0; j--)
			{
				reverse[i] = reverse[i] + string[i].charAt(j); //reversing the strings
			}
		}
		for(int i=0; i<10; i++)
		{	
			if(string[i].equals(reverse[i]))
			{
				pos[id]=i;
				id+=1;
			}
		}					//takes only the palindrome strings
	
		for(int i=0; i<id; i++)
		{
			size[i] = string[pos[i]].length();
		
		}				//stores the character count of each word
	
		for(int i=0; i<id; i++)
		{
			for(int j=0; j<id-1; j++)
			{
				if(size[j]<size[j+1])
				{
					temp = size[j];
					size[j] = size[j+1];
					size[j+1] = temp;
					temp = pos[j];
					pos[j] = pos[j+1];
					pos[j+1] = temp;
				}
			}	
		}			//sorts the array on the basis of character count
	
		System.out.println("Palindrome Strings in descending order of their character count are: ");
		for(int i=0; i<id; i++)
		{
			System.out.println(string[pos[i]]);		//displays the output
		}
	}
}	

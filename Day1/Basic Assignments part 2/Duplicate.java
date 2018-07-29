//Write a program to input a word from the user and remove the duplicate characters present in it.

import java.util.*;
class Duplicate
{
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string");
		char[] name = new char[20];
		name=scanner.next().toCharArray();       //Converts the string into character array
		
		//Compares each character and if they are same then it is replaced with blank space in the array
		for(int i=0; i<name.length; i++)
		{
			char c = name[i];
			for(int j=i+1; j<name.length; j++)
			{
				if(c == name[j])
				{
					name[j]=' ';
				}
			}
		}
		String str = new String(name);
		str=str.replaceAll(" ","");       //removes all the spaces and displays the string after removing them
		System.out.println("Output: "+str);
	}
}
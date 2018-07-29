//Deletes the word at a particular position and also deletes the extra spaces

import java.util.*;
public class WordSpaceDelete
{
	public static void main(String args[])
	{
		int position, count=0;
		String line = new String();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a sentence");
		line=scanner.nextLine();

		System.out.println("Word to be deleted");
		String wordDelete = new String();
		wordDelete = scanner.nextLine();

		int wordLength = wordDelete.length();

		System.out.println("Word position in the sentence");
		position=scanner.nextInt();

		line = line.replaceAll("( )+"," ");
		int len = line.length();
		
		for(int i=0; i<len; i++)
		{
			if(line.charAt(i) == ' ')
				count++;
			if(count==position-1)
			{
				StringBuffer sent=new StringBuffer(line);

				sent=sent.replace(i+1, i+wordLength+1, " ");
				line=sent.toString();
				break;
			}
		}
		line=line.replaceAll("( )+", " ");
		System.out.println(line);
	}
}
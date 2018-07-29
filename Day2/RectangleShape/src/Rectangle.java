/*Consider a Rectangle Shape.
Identify its properties and behaviours and implement the same.
Write a Test Cases to check if the behaviours(methods) are implemented properly.
If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

Test the Program with different combinations test cases possible.*/

import java.util.*;

public interface Rectangle {

	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
		RectangleShape rectangle1 = new RectangleShape();
		RectangleShape rectangle2 = new RectangleShape();//created two objects
		
		
		//Took inputs for first rectangle
		System.out.println("Enter the length of the first rectangle");
		rectangle1.setLength(scanner.nextInt());
		int length1 = rectangle1.getLength();
		
		System.out.println("Enter the breadth of the first rectangle");
		rectangle1.setBreadth(scanner.nextInt());
		int breadth1 = rectangle1.getBreadth();
		
		//Display the behavior of the rectangle
		int area = rectangle1.rectArea(length1, breadth1);
		int perimeter = rectangle1.rectPerimeter(length1, breadth1);
		System.out.println("The area of the first rectangle is "+area);
		System.out.println("The perimeter of the first rectangle is "+perimeter);
		
		
		//Checking whether there is another rectangle if so then compare their areas
		System.out.println("Is Second rectangle present?");
		String answer = scanner.next();
		
		if(answer.equals("yes"))
		{
			System.out.println("Enter the length of the second rectangle");
			rectangle2.setLength(scanner.nextInt());
			int length2 = rectangle2.getLength();
		
			System.out.println("Enter the breadth of the second rectangle");
			rectangle2.setBreadth(scanner.nextInt());
			int breadth2 = rectangle2.getBreadth();
		
			int secondRectArea = rectangle2.rectArea(length2, breadth2);
			int secondRectPerimeter = rectangle2.rectPerimeter(length2, breadth2);
		
			System.out.println("The area of the second rectangle is "+secondRectArea);
			System.out.println("The perimeter of the second rectangle is "+secondRectPerimeter);
		
			if(area == secondRectArea) 
			{
				System.out.println("The area of two rectangles are same");
			}
			else
				System.out.println("The area of two rectangles are different");
		}
		else
			System.out.println("No other rectangle");
			
	}
	
	
}

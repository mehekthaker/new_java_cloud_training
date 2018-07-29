/*Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
void set(int, float) to give value to object
void disp() to display distance in feet and inches
Distance add(Distance) to sum two distances & return distance
1. Write the definitions for each of the above member functions.
2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.*/

import java.util.*;

public class DistanceTest {
	public static void main(String args[])
	{
		Distance distance1 = new Distance();
		Distance distance2 = new Distance();
		Distance dist = new Distance();//Create three objects of the class
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first distance in inches");
		distance1.setInches(scanner.nextFloat());
		float distInch1 = distance1.getInches();
		
		System.out.println("Enter the first distance in feet");
		distance1.setFeet(scanner.nextInt());
		int distFeet1 = distance1.getFeet();
		
		System.out.println("Enter the second distance in inches");
		distance2.setInches(scanner.nextFloat());
		float distInch2 = distance2.getInches();
		
		System.out.println("Enter the second distance in feet");
		distance2.setFeet(scanner.nextInt());
		float distFeet2 = distance2.getFeet();
		
		dist = dist.sum(distance1, distance2);
		System.out.println("Distance is "+dist.getFeet()+" feet and "+dist.getInches()+" inches");
	}

}

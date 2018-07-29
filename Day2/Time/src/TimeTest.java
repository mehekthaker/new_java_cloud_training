/*Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
void setTime(int, int) to set the specified value in object
void showTime() to display time object
time sum(time) to sum two time object & return time
1. Write the definitions for each of the above member functions.
2. Write main function to create three time objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects.*/

import java.util.*;

public class TimeTest {

	public static void main(String args[])
	{
		Time time1 = new Time();
		Time time2 = new Time();
		Time totalTime = new Time();//Create three objects of the class
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first time in hours");
		time1.setHours(scanner.nextInt());
		int timeHr1 = time1.getHours();
		
		System.out.println("Enter the first time in minutes");
		time1.setMinutes(scanner.nextInt());
		int timeMin1 = time1.getMinutes();
		
		System.out.println("Enter the second time in hours");
		time2.setHours(scanner.nextInt());
		int timeHr2 = time2.getHours();
		
		System.out.println("Enter the second time in minutes");
		time2.setMinutes(scanner.nextInt());
		int timeMin2 = time2.getMinutes();
		
		totalTime = totalTime.sum(time1, time2);
		System.out.println("Time is "+totalTime.getHours()+" hours and "+totalTime.getMinutes()+" minutes");
	}

}

//Tests the conditions of Vehicle class, whether they are working properly in every situation

import java.util.*;
public class VehicleMain 
{

	public static void main(String args[])
	{

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of vehicles");

		int numberOfVehicle=scanner.nextInt();
		Vehicle vehicle[]= new Vehicle[numberOfVehicle];

		for(int i=0; i<numberOfVehicle; i++)
		{

			System.out.println("Enter the name of vehicle "+(i+1)+"'s owner");
			vehicle[i]= new Vehicle(scanner.next());

			System.out.println("Enter current speed  of vehicle "+(i+1));
			vehicle[i].changeSpeed(scanner.nextInt());

			System.out.println("Enter current direction of vehicle "+(i+1)+" in degrees");
			vehicle[i].setDegree(scanner.nextInt());

			System.out.println("Do you want to change the vehicle speed? Yes/No");
			String changeSpeed=scanner.next();
			if(changeSpeed.equalsIgnoreCase("Yes")) {
				System.out.println("Enter the desired speed");
				vehicle[i].changeSpeed(scanner.nextInt());		//calls the changeSpeed() method to change the original speed to entered value
			}

			System.out.println("Do you want to turn? Yes/No");
			String answerTurn=scanner.next();
			if(answerTurn.equalsIgnoreCase("Yes")) 
			{
				System.out.println("Directly turn Left or Right?");
				String answerTurnValue=scanner.next();
				if(answerTurnValue.equalsIgnoreCase("Left")) 
					vehicle[i].turnLeftRight(Vehicle.TURN_LEFT);		//Calls the static method
				else if(answerTurnValue.equalsIgnoreCase("Right")) 
					vehicle[i].turnLeftRight(Vehicle.TURN_RIGHT);		//Calls the static method
				else
				{
					System.out.println("Turn by certain degrees? Yes/No");
					String turn=scanner.next();
					if(turn.equalsIgnoreCase("Yes")) 
					{
						System.out.println("By what value you want to change? Enter positive value to turn left,negative to turn right");
						int change=scanner.nextInt();
						vehicle[i].changeDirection(change);		//calculates the new direction after changing 
					}
				}
			}
			System.out.println("Do you want to stop the vehicle? Yes/No");
			String stop=scanner.next();
			if(answerTurn.equalsIgnoreCase("Yes")) 
				vehicle[i].stop();		//calls the stop method to change the speed to 0
			
			System.out.println("---------------------------------------------------------------------------------------------------");
			
		}

		System.out.println("The highest identification number is "+ Vehicle.getIdentificationNumber());

		for(int i=0; i<numberOfVehicle; i++)
			System.out.println(vehicle[i].toString());	//displays the output 

	}		
}


//using command line arguments pass any 3 numbers and print their total.

public class CommandLineArgs
{
	public static void main(String args[])
	{
		System.out.println("The sum of three numbers is "+(Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2])));
		//converts the string values to integer type
	}
}
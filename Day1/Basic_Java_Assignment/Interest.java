//4)	Find out the simple as well as the compound interest of supplied  value 

import java.util.*;
class Interest
{
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double p =scanner.nextDouble();
		
		System.out.println("Enter the time period");
		double n =scanner.nextDouble();
		
		System.out.println("Enter the rate of interest");
		double r =scanner.nextDouble();
		
		double si = (p*n*r)/100;
		double ci = (p*Math.pow(1+(r/100), n))-p;
		
		System.out.println("Simple interest is "+si);
		System.out.println("Compound interest is "+ci);
		
		
	}
}
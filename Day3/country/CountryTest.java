//Displays the country with largest population, largest area, largest population density among the array object of country 
import java.util.*;

public class CountryTest{

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of countries");
		int num = scanner.nextInt();
		
		Country[] country = new Country[num];  //creating array of objects
		
		for(int i=0; i<num; i++)
		{
			country[i] = new Country(); //instantiating the objects
			
			System.out.println("Enter the name of the country");
			country[i].setCountryName(scanner.next());
			
			System.out.println("Enter the area of the country");
			country[i].setArea(scanner.nextDouble());
			
			System.out.println("Enter the population of the country");
			country[i].setPopulation(scanner.nextDouble());
		}//takes the inputs
		
		System.out.println("The country with the largest area is "+country[0].largestArea(num, country));
		
		System.out.println("The country with the largest population is "+country[0].largestPopulation(num, country));
		
		System.out.println("The country with the largest population density is "+country[0].largestPopDensity(num, country));
		//displays the output
	}


}
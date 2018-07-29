public class Country{

	private String countryName;
	private double population;
	private double area;

//getters and setters for the above private fields		
	public void setCountryName(String countryName){
		this.countryName = countryName;
	}
	public String getCountryName(){
		return countryName;
	}
	
	public void setPopulation(double population){
		this.population = population;
	}
	public double getPopulation(){
		return population;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	public double getArea(){
		return area;
	}
	
	//Finds the largest area from the countries
	public String largestArea(int num, Country C[])
	{
		int i, flag=0;
		double maxArea = C[0].getArea();
		for(i=0;i<num;i++)
		{
			if(C[i].getArea()>maxArea)
			{
				maxArea = C[i].getArea();
				flag = i;
			}
		}
		return C[flag].getCountryName();	
	}
	
	//Finds the largest population from the countries
	public String largestPopulation(int num, Country C[])
	{
		int i, flag=0;
		double maxPopulation = C[0].getPopulation();
		for(i=0;i<num;i++)
		{
			if(C[i].getPopulation()>maxPopulation)
			{
				maxPopulation = C[i].getPopulation();
				flag = i;
			}
		}
		return C[flag].getCountryName();	
	}
	
	//Calculates and finds the largest population density from the countries
	public String largestPopDensity(int num, Country C[])
	{
		int i, flag=0;
		double maxPopDensity = C[0].getPopulation()/C[0].getArea();
		for(i=0;i<num;i++)
		{
			if(C[i].getPopulation()/C[i].getArea()>maxPopDensity)
			{
				maxPopDensity = C[i].getPopulation()/C[i].getArea();
				flag = i;
			}
		}
		return C[flag].getCountryName();	
	}
}
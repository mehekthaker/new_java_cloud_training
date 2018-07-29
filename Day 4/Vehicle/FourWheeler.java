//inherits parent class Vehicle and overrides start() method
class FourWheeler extends Vehicle
{
	FourWheeler()
	{
		System.out.println("Constructor of Four Wheeler class");
	}
	public void start()
	{
		System.out.println("This is the four-wheeler class");
	}
	//Overrides the method
}
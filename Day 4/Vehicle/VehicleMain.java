//create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. 
//Override "start()" method of parent class and test it.

public class VehicleMain
{
	public static void main(String args[])
	{
		FourWheeler fw = new FourWheeler();		
		fw.start();
		
		System.out.println("-------------------------------------------------------");
		Vehicle v = new Vehicle();
		v.start();
		
	}
}
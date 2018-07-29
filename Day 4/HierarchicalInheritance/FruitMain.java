//Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

public class FruitMain
{
	public static void main(String args[])
	{
		Apple a = new Apple();	//Executes both the constructor that is Apple and Fruits class
		a.display();		
		
		System.out.println("-----------------------------------------------");
		
		Mango m = new Mango();	//Executes both the constructor that is Mango and Fruits class
		m.display();
		
		System.out.println("-----------------------------------------------");
		
		Fruits f = new Fruits();
		f.display();
		
		
		
	}
}
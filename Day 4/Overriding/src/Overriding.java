//Example of Overriding
class A
{
	public void display()
	{
		System.out.println("This is A-class");
	}
}


public class Overriding extends A {
	
	public void display() 
	{
		
		System.out.println("This is B-class");
	}
	
	public static void main(String args[])
	{
		//Creating the object of the class and calling the functions of both the classes
		Overriding b = new Overriding();
		b.display();
		
		A a = new A();
		a.display();

	}

}

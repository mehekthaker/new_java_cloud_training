//child class of parent class ClassB
public class ClassC extends ClassB
{
	ClassC()
	{
		System.out.println("This is child class C");
	}//constructor of parent class C
	
	public void display()
	{
		System.out.println("Class C method");
	}//overrides the method C
}
//child class of parent class ClassA
public class ClassB extends ClassA
{
	ClassB()
	{
		System.out.println("This is child class B");
	}//constructor of class B
	
	public void display()
	{
		System.out.println("Class B method");
	}//overrides the method B
}
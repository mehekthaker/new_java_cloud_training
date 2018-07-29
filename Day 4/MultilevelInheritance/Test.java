//Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
//Also show, if needed how will u invoke parent class constructor from child class ?
public class Test
{
	public static void main(String args[])
	{
		ClassC cc = new ClassC();
		cc.display();
		
		System.out.println("-------------------------------------");
		
		ClassB bb = new ClassB();
		bb.display();
		
		System.out.println("-------------------------------------");
		
		ClassA aa = new ClassA();
		aa.display();
		
	}
}
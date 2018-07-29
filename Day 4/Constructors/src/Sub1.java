//Child class Sub1 inherits base class Base1
public class Sub1 extends Base1
{	int num1, num2;

	Sub1()
	{
		super(20);
		System.out.println("This is the Default constructor");
	}
	
	Sub1(int num)
	{
		super(num);
		System.out.println("This is parameterized constructor with one argument, "+num);
	}

	
	Sub1(int num1, int num2)
	{
		super(num1);
		System.out.println("This is parameterized constructor with one argument, "+num1+", "+num2);
	}
	
	
	
}

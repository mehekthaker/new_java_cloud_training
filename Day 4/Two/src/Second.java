
public class Second {

	private int num1;
	private int num2;

	//Parameterized constructor
	Second(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}

	//setters for both the numbers
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	//Subtraction method
	public int subtract(int num1, int num2) 
	{
		int sub = Math.abs(num1 - num2);
		System.out.println("Subtraction is: "+sub);
		return sub;
	}
	
	//Addition method
	public int add(int num1, int num2) 
	{
		int sum = num1 + num2;
		System.out.println("Addition is: "+sum);
		return sum;
	}
	
	
}

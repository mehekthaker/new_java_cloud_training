//parent class is defined with one function and child class with the function having the same name but different 
//argument. Create an instance of child class and call the functions

class Calculate{
	public int area(int side)
	{
		System.out.println(side*side);
		return side*side;
	}
}

//Inherits the above class Calculate and overloads the method area
public class Overloading extends Calculate
{

	public int area(int length, int breadth) 
	{
		System.out.println(length*breadth);
		return length*breadth;
	}
	
	public static void main(String args[]) 
	{
		Overloading o = new Overloading();
		o.area(10,20);
		
		Calculate o1 = new Calculate();
		o1.area(10);
	}
}

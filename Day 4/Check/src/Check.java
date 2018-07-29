
public class Check {

//implementing the default class	
	class DefaultClass
	{	
		void display() 
		{
			System.out.println("This is the default class");
		}
	}

//implementing the public class
	public class ImpPublic
	{
		
		public void display() 
		{
			System.out.println("This is the public class");
		}
	}
	
//implementing the private access modifier
	public class ImpPrivate
	{
		private int i=10;
		private void display() 
		{
			System.out.println("This is the implementation of private access modifier");
		}
	}
	
//implementing protected access modifier
	public class ImpProtected
	{
		protected g = 4;
		protected void display() 
		{
			System.out.println("This is the implementation of protected access modifier");
		}
	}
	
}

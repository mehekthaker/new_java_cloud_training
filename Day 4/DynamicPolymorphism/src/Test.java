//Create a class "Top1" with "disp1()" method. From this class derive "Bottom1", "Bottom2", "Bottom3"
//classes, override the "disp1()". now show how will you achieve dynamic polymorphism.


public class Test {

	public static void main(String args[]) 
	{
		//upcasting is used to instantiate the objects 
		Top1 top = new Bottom1();
		top.display();
		
		Top1 top1 = new Bottom2();
		top1.display();
		
		Top1 top2 = new Bottom3();
		top2.display();
	}
}

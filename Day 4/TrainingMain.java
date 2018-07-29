//public training and corporate training inherits parent training class and using upcasting to create object instance for each child class and calculating the cost

public class TrainingMain
{
	public static void main(String args[])
	{
		Training pubTraining = new PublicTraining("Java", 5000, 50); 	//upcasting
		System.out.println("The cost of training for public training = "+pubTraining.getOrderValue());	//displays the cost of public training
		
		
		Training corpTraining = new CorporateTraining("Big Data", 35000, 4); 	//upcasting
		System.out.println("The cost of training for corporate training = "+corpTraining.getOrderValue());		//displays the cost of corporate training
	}
}
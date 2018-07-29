//child class of Training
class PublicTraining extends Training
{
	int participants;

//Parameterized constructor with arguments subject, fees, participants	
	PublicTraining(String subject, double fees, int participants)
	{
		this.subject = subject;
		this.fees = fees;
		this.participants = participants;
	}

//abstract method of parent class is overridden	
	public double getOrderValue()
	{
		return (fees * participants);
	}
}
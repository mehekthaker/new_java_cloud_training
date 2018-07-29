//child class of Training
public class CorporateTraining extends Training
{
	int days;

//Parameterized constructor with arguments subject, fees, days	
	CorporateTraining(String subject, double fees, int days)
	{
		this.subject=subject;
		this.fees=fees;
		this.days=days;
	}

//abstract method overridden	
	public double getOrderValue()
	{
		return (fees * days);
	}
}
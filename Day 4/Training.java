//Parent abstract class Training with an abstract method getOrderValue

abstract public class Training
{
	int id;
	String subject;
	double fees;
	abstract double getOrderValue();
}
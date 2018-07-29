//Calculates the sum of the distances and displays the result in feet and inches
public class Distance {

	private int feet;
	private float inches;
	
	
	
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	
	
	public float getInches() {
		return inches;
	}
	public void setInches(float inches) {
			this.inches = inches;
	}
	
	
	public Distance sum(Distance distance1, Distance distance2) 
	{
		Distance dist = new Distance();
		dist.inches = distance1.getInches() + distance2.getInches();
		dist.feet = distance1.getFeet() + distance2.getFeet();
		if(dist.inches % 12 == 0)
		{
			dist.feet += (int) dist.inches/12 ;
			dist.inches = 0;
		}	
		else
		{
			dist.feet += (int) dist.inches/12;
			dist.inches = dist.inches%12;
		}
		
		return dist;
	}
	
	
}

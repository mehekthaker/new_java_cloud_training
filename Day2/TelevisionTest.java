//Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state, volume and channel..finally turn it off

public class TelevisionTest
{
	public static void main(String args[])
	{
		Television tv = new Television();
		
		tv.setStatus(true);
		System.out.println("Television is turned "+tv.whichState());
		System.out.println("----------------------------------------");
		
		tv.setVolume(20);
		System.out.println("The volume is "+tv.getVolume());
		
		tv.increaseVolume();
		System.out.println("The increased volume is "+tv.getVolume());
		
		tv.decreaseVolume();
		System.out.println("The decreased volume is "+tv.getVolume());
		
		System.out.println("----------------------------------------");
		
		System.out.println("The default channel is "+tv.getChannel());
		
		tv.changeChannel(112);
		System.out.println("The changed channel is "+tv.getChannel());
		System.out.println("----------------------------------------");
		
		tv.setStatus(false);
		System.out.println("Television is now turned "+tv.whichState());
		
	}
	
}
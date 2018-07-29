//This class has a status field which is either on or off, volume field in order to increse or decrease the volume and channel field in order to change the channel.

public class Television
{
	private int volume;
	private int channel = 100;
	private boolean status;
	
	public String whichState()
	{
		if(status== true)
		{
			return "ON";
		}
		else
			return "OFF";
	}
	
	public void setStatus(boolean status)
	{
		this.status = status;
	}

	
	
	public int getVolume()
	{
		return volume;
	}
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	public void increaseVolume()
	{
		volume = volume + 1;
	}
	public void decreaseVolume()
	{
		volume = volume - 1;
	}
	
	public int getChannel()
	{
		return channel;
	}
	public void changeChannel(int channel)
	{
		this.channel = channel;
	}
	
}
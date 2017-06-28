package data;

public class Tv {

	private boolean status;
	private int channel;
	private int volume;

	public Tv(boolean status, int channel, int volume) {
		// TODO Auto-generated constructor stub
		this.status=status;
		this.channel=channel;
		this.volume=volume;
	}

	void tvon()
	{
		this.status=true;
		System.out.println("Tv is on");
	}
	void tvoff()
	{
		this.status=false;
		System.out.println("Tv is off");
	}
	void channelup()
	{
		if(this.status==true)
		{
		this.channel=this.channel+1;
		System.out.println("channel is "+this.channel);
		}
		else
		{
			System.out.println("Sorry! tv is off cant change channel" );
		}
	}
	void channeldown()
	{
		if(this.status==true)
		{
		this.channel=this.channel-1;
		System.out.println("channel is "+this.channel);
		}
		else
		{
			System.out.println("Sorry! tv is off cant change channel" );
		}
	}
	void volumehigh()
	{
		if(this.status==true)
		{
		this.volume=this.volume+1;
		System.out.println("volume is "+this.volume);
		}
		else
		{
			System.out.println("Sorry! tv is off cant change volume" );
		}
	}
	void volumelow()
	{
		if(this.status==true)
		{
		this.volume=this.volume-1;
		System.out.println("volume is "+this.volume);
		}
		
		else
		{
			System.out.println("Sorry! tv is off cant change volume" );
		}
		
		
		}
	public int getchan()
	{
		return this.channel;
	}
	public boolean getstatus()
	{
		return this.status;
	}
}

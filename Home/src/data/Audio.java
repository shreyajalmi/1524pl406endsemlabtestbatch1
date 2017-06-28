package data;

public class Audio {

	private int volume;
	private boolean status;

	public Audio(boolean b, int i) {
		// TODO Auto-generated constructor stub
		this.status=b;
		this.volume=i;
	}
	void musicon()
	{
		this.status=true;
		System.out.println("audio system is on");
	}
	void musicoff()
	{
		this.status=false;
		System.out.println("audio system is off");
	}
	public void volumedown() {
		// TODO Auto-generated method stub
		if(this.status==true)
		{
		this.volume=this.volume-1;
		System.out.println("volume is "+this.volume);
		}
		else
		{
			System.out.println("Sorry! audio system is off cant decrease volume" );
		}
		
	}
	public void volumeup() {
		// TODO Auto-generated method stub
		if(this.status==true)
		{
		this.volume=this.volume+1;
		System.out.println("volume is "+this.volume);
		}
		else
		{
			System.out.println("Sorry! audio system is off cant decrease volume" );
		}
	}
	public boolean getAudio()
	{
		return this.status;
	}
}

package data;

public class Light {

	private boolean status;

	public Light(boolean b) {
		// TODO Auto-generated constructor stub
		this.status=b;
	}
	void lighton()
	{
		this.status=true;
		System.out.println("Light is on");
	}
	void lightoff()
	{
		this.status=false;
		System.out.println("light is off");
	}
	public boolean getLight()
	{
		return this.status;
	}

}

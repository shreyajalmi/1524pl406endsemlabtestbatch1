package data;

public class WMachine {

	private boolean status;

	public WMachine(boolean b) {
		// TODO Auto-generated constructor stub
		this.status = b;
	}
	void washon()
	{
		this.status=true;
		System.out.println("washing machine is on");
	}
	void washoff()
	{
		this.status=false;
		System.out.println("washing machine is off");
	}
	public boolean getMachine()
	{
		return this.status;
	}
}

package data;

public class Has {

	public static void main(String[] args) {
		Light l1=new Light(false);
		Ac ac1=new Ac(false,17);
		WMachine wm1 =new WMachine(false);
		Tv tv1 =new Tv(false,112,20);
		Audio a1=new Audio(false,20);
		HasOwner ho1= new HasOwner(tv1,l1,ac1,wm1,a1);
		
		//light
		ho1.light.lighton();
		ho1.light.lightoff();
		
		//ac
		ho1.ac.acoff();
		ho1.ac.acon();
		ho1.ac.tempraturedown();
		ho1.ac.acoff();
		ho1.ac.tempratureup();
		
		//washing machine
		ho1.washing.washon();
		ho1.washing.washoff();
		
		//tv
		ho1.tv.channeldown();
		ho1.tv.channelup();
		ho1.tv.tvon();
		ho1.tv.tvoff();
		ho1.tv.volumehigh();
		ho1.tv.tvon();
		ho1.tv.volumelow();
		
		//audio
		ho1.music.musicon();
		ho1.music.volumedown();
		ho1.music.volumeup();
		ho1.music.musicoff();
		ho1.music.volumeup();
	}

}

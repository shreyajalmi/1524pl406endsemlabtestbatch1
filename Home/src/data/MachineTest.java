package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class MachineTest {
	WMachine wm1= new WMachine(true);
	@Test
	public void test() throws Exception  {
		
		wm1.washon();
		assertEquals(true,wm1.getMachine());
	}
}

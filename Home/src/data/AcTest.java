package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class AcTest {
	Ac ac1= new Ac(true,17);
	@Test
	public void test() throws Exception  {
		
		ac1.acon();
		assertEquals(true,ac1.getACstatus());
	}
	@Test
	public void testChannel() throws Exception  {
		
		ac1.tempraturedown();
		assertEquals(16,ac1.getAc());
	}


}

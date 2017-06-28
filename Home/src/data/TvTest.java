package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class TvTest {
	Tv tv1= new Tv(true,18,12);
	@Test
	public void test() throws Exception  {
		
		tv1.tvon();
		assertEquals(true,tv1.getstatus());
	}
	@Test
	public void testChannel() throws Exception  {
		
		tv1.channeldown();
		assertEquals(17,tv1.getchan());
	}

}

package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class AudioTest {
	Audio a1= new Audio(true,17);
	@Test
	public void test() throws Exception  {
		
		a1.musicon();
		assertEquals(true,a1.getAudio());
	}

}

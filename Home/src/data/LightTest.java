package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightTest {
	Light l1= new Light(true);
	@Test
	public void test() throws Exception  {
		
		l1.lighton();
		assertEquals(true,l1.getLight());
	}

}

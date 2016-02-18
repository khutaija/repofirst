import static org.junit.Assert.*;

import org.junit.Test;

public class UglyTest {
	
	Ugly test = new Ugly();

	@Test
	public void testIsUgly() {
		
		assertTrue(test.isUgly(30));
		assertTrue(test.isUgly(900));
		assertTrue(test.isUgly(4));
		assertFalse(test.isUgly(84));
		assertFalse(test.isUgly(14));
	}

}

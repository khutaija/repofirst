import static org.junit.Assert.*;

import org.junit.Test;

public class CountTest {
	
	Count test = new Count();

	@Test
	public void testCountDigits() {
		int actualOutput1 = test.countDigits(500);
		int expectedOutput1 = 2;
		assertEquals(expectedOutput1, actualOutput1);
		
		int actualOutput2 = test.countDigits(100);
		int expectedOutput2 = 1;
		assertEquals(expectedOutput2, actualOutput2);
		
		int actualOutput3 = test.countDigits(50);
		int expectedOutput3 = 0;
		assertEquals(expectedOutput3, actualOutput3);
	}

}

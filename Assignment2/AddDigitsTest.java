import static org.junit.Assert.*;

import org.junit.Test;

public class AddDigitsTest {

	AddDigits test = new AddDigits();
	
	@Test
	public void testAddDigitsSingle() {
		int actualOutput = test.addDigits(2);
		int expectedOutput = 2;
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void testAddDigitsThree() {
		int actualOutput = test.addDigits(963);
		int expectedOutput = 9;
		assertEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void testAddDigitsDouble() {
		int actualOutput = test.addDigits(23);
		int expectedOutput = 5;
		assertEquals(actualOutput, expectedOutput);
	}

}

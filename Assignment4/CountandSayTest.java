import static org.junit.Assert.*;

import org.junit.Test;

public class CountandSayTest {

	CountandSay test = new CountandSay();

	@Test
	public void testCountAndSay() {

		String expectedOutput = "3a4b2c";
		String actualOutput = test.countAndSay("aabbccbab");
		assertEquals(expectedOutput, actualOutput);

		String expectedOutput1 = "5a2b1c2f";
		String actualOutput1 = test.countAndSay("aabcaaffab");
		assertEquals(expectedOutput1, actualOutput1);

		String expectedOutput2 = null;
		String actualOutput2 = test.countAndSay("");
		assertEquals(expectedOutput2, actualOutput2);

	}

}

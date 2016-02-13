import static org.junit.Assert.*;

import org.junit.Test;

public class CompareTest {

	Compare test = new Compare();

	@Test
	public void testVersionCompare() {

		Integer actualOutput = test.versionCompare("1.2.3", "5.2.3");
		Integer expectedOutput = -1;
		assertEquals(expectedOutput, actualOutput);

		Integer actualOutput1 = test.versionCompare("2.3.3", "1.1.5");
		Integer expectedOutput1 = 1;
		assertEquals(expectedOutput1, actualOutput1);

		Integer actualOutput2 = test.versionCompare("3.3.3", "3.3.3");
		Integer expectedOutput2 = 0;
		assertEquals(expectedOutput2, actualOutput2);

		Integer actualOutput3 = test.versionCompare("3.3", "1.2.2");
		Integer expectedOutput3 = 1;
		assertEquals(expectedOutput3, actualOutput3);
	}

}

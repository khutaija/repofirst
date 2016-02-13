import static org.junit.Assert.*;

import org.junit.Test;

public class CountWordsTest {

	CountWords test = new CountWords();

	@Test
	public void testCountWords() {

		int expectedOutput = 5;
		int actualOutput = test.countWords("This is the year 2016");
		assertEquals(expectedOutput, actualOutput);

		int expectedOutput1 = 0;
		int actualOutput1 = test.countWords("");
		assertEquals(expectedOutput1, actualOutput1);

		int expectedOutput2 = 1;
		int actualOutput2 = test.countWords("Hallelujah");
		assertEquals(expectedOutput2, actualOutput2);

	}

}

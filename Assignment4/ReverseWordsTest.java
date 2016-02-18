import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseWordsTest {

	ReverseWords test = new ReverseWords();

	@Test
	public void testReverseString2() {

		String actualOutput = test.reverseString2("These moments of impact define who we are");
		String expectedOutput = "are we who define impact of moments These";
		assertEquals(expectedOutput, actualOutput);

		String actualOutput1 = test.reverseString2("");
		String expectedOutput1 = null;
		assertEquals(expectedOutput1, actualOutput1);

		String actualOutput2 = test.reverseString2("Reverse");
		String expectedOutput2 = "Reverse";
		assertEquals(expectedOutput2, actualOutput2);

	}

}

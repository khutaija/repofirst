import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalizeLettersTets {

	CapitalizeLetters test = new CapitalizeLetters();

	@Test
	public void testCapitalizeLetters() {

		String actualOutput = test.capitalizeLetters("a corporeal patronus");
		String expectedOutput = "A Corporeal Patronus";
		assertEquals(expectedOutput, actualOutput);

		String actualOutput1 = test.capitalizeLetters("");
		String expectedOutput1 = null;
		assertEquals(expectedOutput1, actualOutput1);

	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseLettersTest {
	
	ReverseLetters test = new ReverseLetters();

	@Test
	public void testReverseString1() {
		
	
		String expectedOutput = "semordnilap fo raef a si aibohphobiA";
		assertEquals(expectedOutput, test.reverseString1("Aibohphobia is a fear of palindromes"));
		
		String expectedOutput1 = "IPPISISSIM";
		assertEquals(expectedOutput1, test.reverseString1("MISSISIPPI"));
		
		String expectedOutput2 = null;
		assertEquals(expectedOutput2, test.reverseString1(""));
		
	}

}

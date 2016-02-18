import static org.junit.Assert.*;

import org.junit.Test;

public class CountLettersTest {
	
	CountLetters test = new CountLetters();

	@Test
	public void testCountLetterPresent() {
		String str = "The Missisippi river is blue in colour";
		char c = 'i';
		int actualOutput1 = test.countLetter(str,c);
		int expectedOutput1 = 7;
		assertEquals(actualOutput1, expectedOutput1);
	}
		
		@Test
		public void testCountLetterAbsent() {
		String str1 = "To be or not to be";
		char ch = 'i';
		int actualOutput2 = test.countLetter(str1,ch);
		int expectedOutput2 = 0;
		assertEquals(actualOutput2, expectedOutput2);
	}

}
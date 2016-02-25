import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseArrayJTest {
	
	Assignment5 test = new Assignment5();
	
	@Test
	public void testReverse()
	{
		int[] input = {5, 1, 9, 0};
		int[] expectedOutput = {0, 9, 1, 5};
		int[] actualOutput = test.reverseArrayInPlace(input);
		assertArrayEquals(actualOutput, expectedOutput);
	}
	
    @Test
	public void testEmpty()
	{
		int[] input = null;
		int[] expectedOutput = null;
		int[] actualOutput = test.reverseArrayInPlace(input);
		assertArrayEquals(actualOutput, expectedOutput);
		
	}
		
	}

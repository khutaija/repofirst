import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseWithoutModifyJTest {
	
	Assignment5 testreverse = new Assignment5();

	@Test
	public void reverseArrayWithoutModifyInputTest() {
		int[] input = {5, 1, 9, 0};
		int[] actualOutput = testreverse.reverseArrayWithoutModifyInput(input);
		int[] expectedOutput = {0, 9 , 1 ,5};
		assertArrayEquals(actualOutput, expectedOutput);
	}

}

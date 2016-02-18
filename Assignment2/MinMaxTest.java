import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTest {
	
	MinMax test = new MinMax();

	@Test
	public void testFindMinMax() {
		
		int[] numbers = {6,34,98,13,3,59,72,23,75};
		int[] actualOutput1 = test.findMinMax(numbers);
		int[] expectedOutput1 = {98,3};
		assertArrayEquals(actualOutput1, expectedOutput1);
		
		int[] numbers2 = {6,34,0,13,3,59,72,-23,75};
		int[] actualOutput2 = test.findMinMax(numbers2);
		int[] expectedOutput2 = {75,-23};
		assertArrayEquals(actualOutput2, expectedOutput2);
	}

}

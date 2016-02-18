import static org.junit.Assert.*;

import org.junit.Test;

public class ComputeSumTest {
	
	ComputeSum test = new ComputeSum();

	@Test
	public void testSumArray() {
		int[] numbers = {4,17,8,31,9,6};
		int actualOutput1 = test.sumArray(numbers);
		int expectedOutput1 = 75;
		assertEquals(actualOutput1, expectedOutput1);
	
		int[] numbers1 = {-1, 98, 46};
		int actualOutput2 = test.sumArray(numbers1);
		int expectedOutput2 = 143;
		assertEquals(actualOutput2, expectedOutput2);
	
		int[] numbers2 = {0,0};
		int actualOutput3 = test.sumArray(numbers2);
		int expectedOutput3 = 0;
		assertEquals(actualOutput3, expectedOutput3);
	
	}
	
	

}

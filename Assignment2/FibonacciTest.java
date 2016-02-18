import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {
	Fibonacci test = new Fibonacci();
	
	@Test
	public void testFibonacciNumber() {
		int[] expectedOutput1 = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
		int[] actualOutput1 = test.fibonacciNumber(12);
		assertArrayEquals(actualOutput1, expectedOutput1);
		
		int[] expectedOutput2 = {};
		int[] actualOutput2 = test.fibonacciNumber(0);
		assertArrayEquals(actualOutput2, expectedOutput2);
		
		int[] expectedOutput3 = {1};
		int[] actualOutput3 = test.fibonacciNumber(1);
		assertArrayEquals(actualOutput3, expectedOutput3);
	}

}

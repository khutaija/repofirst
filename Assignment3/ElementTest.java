import static org.junit.Assert.*;

import org.junit.Test;

public class ElementTest {
	
	Element test = new Element();

	@Test
	public void testDeleteElement() {
		int[] input = {1, 2, 3, 4, 5,6,7};
		int index;
		index = 5;
		int[] actualOutput = test.deleteElement(input, index);
		int[] expectedOutput = {1, 2, 3, 4, 5, 7};
		assertArrayEquals(actualOutput, expectedOutput);
	
	
	
		int[] input1 = {1, 2, 3, 4, 5,6,7};
		int index1;
		index1 = 1;
		int[] actualOutput1 = test.deleteElement(input1, index1);
		int[] expectedOutput1 = {1,3, 4, 5,6, 7};
		assertArrayEquals(actualOutput1, expectedOutput1);
	}

}

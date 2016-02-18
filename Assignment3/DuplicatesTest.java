import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicatesTest {

	Duplicates test = new Duplicates();
	@Test
	public void testFindDuplicates() {
		
		int[] array1 = {1,2,3,3,5,7,8,9};
		assertTrue(test.findDuplicates(array1));
		
		int[] array2 = {1,2,3,4,5,7,8,9};
		assertFalse(test.findDuplicates(array2));
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	PrimeNumber test = new PrimeNumber();
	
	@Test
	public void test() {
		assertTrue(test.isPrimeNumber(13));
		assertFalse(test.isPrimeNumber(100));
		assertFalse(test.isPrimeNumber(-3));
	}

}

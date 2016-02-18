import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {
	
	Robot test = new Robot();

	@Test
	public void testCheckMessage() {
		
		String msg1 = "SOSSULSOP";
		int actualOutput1 = test.checkMessage(msg1);
		int expectedOutput1 = 3;
		assertEquals(actualOutput1, expectedOutput1);
		
		String msg2 = "SOSSOSSOS";
		int actualOutput2 = test.checkMessage(msg2);
		int expectedOutput2 = 0;
		assertEquals(actualOutput2, expectedOutput2);
		
		String msg3 = "FOSSOSSOP";
		int actualOutput3 = test.checkMessage(msg3);
		int expectedOutput3 = 2;
		assertEquals(actualOutput3, expectedOutput3);
	}

}

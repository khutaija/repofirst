import static org.junit.Assert.*;

import org.junit.Test;

public class WierdNumberTest {

WierdNumber test = new WierdNumber();

	
	@Test
	public void testWierdNumber1() {
	  String  actualOutput = test.wierdNumber(3);
	   String expectedOutput = "Wierd";
	   assertEquals(actualOutput, expectedOutput);
	}

	@Test
	public void testWierdNumber2() {
	
		   String actualOutput = test.wierdNumber(18);
		    String expectedOutput = "Wierd";
		    assertEquals(actualOutput, expectedOutput);
	}

	@Test
	public void testNotWierdNumber1() {
 
		   String actualOutput = test.wierdNumber(4);
		    String expectedOutput = "Not Wierd";
		    assertEquals(actualOutput, expectedOutput);
	}

	@Test
	public void testNotWierdNumber2() {
	
		   String actualOutput = 	test.wierdNumber(96);;
		    String expectedOutput = "Not Wierd";
		    assertEquals(actualOutput, expectedOutput);
		    
	}
	
}


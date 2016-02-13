import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LastWordTest {

	@Test
	public void testLengthOfLastWord() {
		
	    LastWord test = new LastWord();
	    int expectedOutput = 7;
	   
	    int actualOutput = test.lengthOfLastWord("Your best teacher is your last mistake");
	    assertEquals(expectedOutput, actualOutput);
	    
	    int expectedOutput1 = 0;
	    int actualOutput1 = test.lengthOfLastWord("Your best teacher is your last mistake ");
	    assertEquals(expectedOutput1, actualOutput1);
	    
	    int expectedOutput2 = 0;
	    int actualOutput2 = test.lengthOfLastWord("");
	    assertEquals(expectedOutput2, actualOutput2);
	}

}

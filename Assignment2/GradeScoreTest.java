import static org.junit.Assert.*;

import org.junit.Test;

public class GradeScoreTest {
	
	GradeScore test = new GradeScore();

	@Test
	public void test() {
		
		int[] score = {95, 41, 60, 83, 74};
		int[] expectedOutput = {4, 0, 1, 3, 2};
		int[] actualOutput = test.checkGrade(score);
		assertArrayEquals(actualOutput, expectedOutput);
	}
	
	@Test
	public void testZero() {
		
		int[] score = {-1, 41, 60, 0, 74};
		int[] expectedOutput = {0, 0, 1, 0, 2};
		int[] actualOutput = test.checkGrade(score);
		assertArrayEquals(actualOutput, expectedOutput);
	}

}

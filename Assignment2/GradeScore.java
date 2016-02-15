/**
 * Input an array of scores and return the right grades based on following rules
 * 90<=score -->4 80<=score<90 -->3 70<=score<80 -->2 60<=score<70 -->1 score<60
 * -->0
 */
public class GradeScore {

	public int[] checkGrade(int[] scores) {
		int[] x = new int[scores.length];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 90)
				x[i] = 4;

			if ((scores[i] >= 80) && (scores[i] < 90))
				x[i] = 3;

			if ((scores[i] < 80) && (scores[i] >= 70))
				x[i] = 2;

			if ((scores[i] >= 60) && (scores[i] < 70))
				x[i] = 1;

			if (scores[i] < 60)
				x[i] = 0;
		}

		return x;

	}

	public static void main(String[] args) {
		GradeScore student = new GradeScore();
		int[] score = { 95, 51, 60, 83, 74 };
		int[] var = student.checkGrade(score);
		for (int j = 0; j < var.length; j++)
			System.out.println("Your grade is " + var[j]);

	}
}

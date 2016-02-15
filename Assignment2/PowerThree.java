/**
 * Write a method to find all numbers(<=n) which are power of three.
 */
public class PowerThree {

	public int[] findPowerOfThree(int n) {
		int[] powers;
		powers = new int[n];
		powers[0] = 1;
		if (n > 1) {
			for (int i = 1; i < n; i++)
				powers[i] = (3 * powers[i - 1]);
		}
		return powers;
	}

	public static void main(String[] args) {
		PowerThree number = new PowerThree();
		System.out.println("The powers of three upto n are:");
		int[] var = number.findPowerOfThree(9);
		for (int j = 0; j < var.length; j++)
			System.out.println(var[j]);
	}

}

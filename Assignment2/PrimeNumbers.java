/**
 * Write a method to determine whether a number is prime
 */

public class PrimeNumber {

	public boolean isPrimeNumber(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		boolean x = prime.isPrimeNumber(14);
		if (x == true)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");

	}

}
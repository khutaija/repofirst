/**
 * Given a non-negative integer n, repeatedly add all its digits until the
 * result has only one digit. For example: Given n = 38, the process is like: 3
 * + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class AddDigits {
	public int addDigits(int n) {
		int sum = 0;
		while (n > 9) {
			sum = 0;
			while (n > 0) {
				int rem;
				rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		if(n<9)
			sum = n;
		return sum;
	}

	public static void main(String[] args) {
		AddDigits add = new AddDigits();
		int number = add.addDigits(2);
		System.out.println("The sum of digits is: " + number);

	}
}

/**
	 * Given an integer N as input, check the following:
	 * If N is odd, print "Weird".
	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
	 * If N is even and N>20, print "Not Weird".
*/
public class WierdNumber {

	public void wierdNumber(int N) {
		if (N % 2 == 1)
			System.out.println("Wierd");

		if ((N % 2 == 0) && ((2 <= N) && (N <= 5)))
			System.out.println("Not Wierd");

		if ((N % 2 == 0) && ((6 <= N) && (N <= 20)))
			System.out.println("Wierd");

		if ((N % 2 == 0) && (N > 20))
			System.out.println("Not Wierd");
	}

	public static void main(String[] args) {
		WierdNumber number = new WierdNumber();
		number.wierdNumber(4);

	}
}

class ReverseArrayTest
{
	public static void main(String[] args) {
		int[] input = { 5,1, 9, 0 };
		Assignment5 call1 = new Assignment5();
		int[] output = call1.reverseArrayInPlace(input);
		for (int i = 0; i <= output.length - 1; i++)
			System.out.println(output[i]);
	}
}
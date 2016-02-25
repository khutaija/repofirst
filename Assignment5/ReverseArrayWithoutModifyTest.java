class ReverseArrayWithoutModifyTest{

	public static void main(String[] args) {

		Assignment5 call = new Assignment5();
		int[] input = { 5, 1, 9, 0 };
		int[] output = call.reverseArrayWithoutModifyInput(input);
		for (int i = 0; i <= output.length - 1; i++)
			System.out.println(output[i]);

	}
}
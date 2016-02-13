/**
 * Count and Say. Count each character. e.g. "aabacbaa" --> "5a2b1c"
 */

public class CountandSay {

	public String countAndSay(String str) {

		if (str.equals(""))
			return null;

		String result = "";
		int[] counts;
		counts = new int[Character.MAX_VALUE];

		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			counts[charAt]++;
		}

		for (char i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				result = result + counts[i] + i;
		}
		return result;

	}

	public static void main(String[] args) {
		CountandSay call = new CountandSay();
		String inputstring = "aabcabbabcc";
		String outputString;
		outputString = call.countAndSay(inputstring);
		System.out.println(outputString);
	}

}

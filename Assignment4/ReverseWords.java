/**
 * Reverse a string by words. Do not use 'split' function.
*/

public class ReverseWords {

	public String reverseString2(String str) {

		String temp = "";
		String reversedString = "";

	   if (str.equals(""))
			return null;

		for (int i = str.length() - 1; i >= 0; i--) {

			if (i != 0)
				temp = temp + str.charAt(i);
			else
				temp = temp + str.charAt(i) + " ";

			if (str.charAt(i) == ' ' || i == 0) {

				for (int j = temp.length() - 1; j >= 0; j--) {
					reversedString += temp.charAt(j);
				}
				temp = " ";
			}
		}
	

		reversedString = reversedString.replaceAll("( )+", " ");
		return reversedString;
		}
	
	

	public static void main(String[] args) {

		String inputString = "These moments of impact define who we are";
		String outputString = "";
		ReverseWords call = new ReverseWords();
		outputString = call.reverseString2(inputString);
		System.out.println(outputString);

	}

}

/**
 * Capitalize the first letters of words in a String. Do not use 'split'
 * function. e.g. "I like soccer" --> "I Like Soccer".
 */

public class CapitalizeLetters {

	public String capitalizeLetters(String str) {
		if (str.equals(""))
			return null;

		char[] arrayofstring = str.toCharArray();
		for (int i = 0; i < arrayofstring.length; i++) {//if the last char is ' ', there will be an error because index 'i' is out of bound.           -2
			if (arrayofstring[i] == ' ' && arrayofstring[i + 1] != ' ')
				arrayofstring[i + 1] = Character.toUpperCase(arrayofstring[i + 1]);
		}
		String str1 = new String(arrayofstring);
		return str1;
	}

	public static void main(String[] args) {

		CapitalizeLetters call = new CapitalizeLetters();
		String inputString = "A corporeal patronus";
		String outputString = call.capitalizeLetters(inputString);
		System.out.println("Input string: " + inputString);
		System.out.println("Output string: " + outputString);

	}

}

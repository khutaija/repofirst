import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String s, String t) {
		if(s.length() ==0 || t.length()==0 || s.length()!=t.length())
		return false;
		char stringArray1[] = s.toCharArray();
		char stringArray2[] = t.toCharArray();
		Arrays.sort(stringArray1);
		Arrays.sort(stringArray2);
		String sortedS = new String(stringArray1);
		String sortedT = new String(stringArray2);
		if (sortedS.equals(sortedT))
			return true;
		return false;
	}

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		Anagram call = new Anagram();
		boolean result = call.isAnagram(str1, str2);
		System.out.println("The two strings are anagrams : " +result);

	}

}

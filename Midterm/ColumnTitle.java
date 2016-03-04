import java.util.Scanner;

public class ColumnTitle {
	public int titleToNumber(String title) {

		if (title.length() == 0)
			return 0;
		int result = 0;
		int base = 26;
		for (int i = 0; i < title.length(); i++) {
			result = (result * base ) + (title.charAt(i) - 'A' + 1);
		}
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the Column Title");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		ColumnTitle call = new ColumnTitle();
		int result = call.titleToNumber(str1);
		System.out.println("The Column Number is " +result);

	}

}

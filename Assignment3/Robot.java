/**
	 * A robot from Mars send a long message to Earth which only contains many "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS"
	 * But the radiation from universe changed some characters of the massage.
	 * Write a method to count how many characters were changed.
	 * For example, "SOSSOSSOS" might be changed to "SOSSUSSOP", then your method should return 2.
	 * The message was consisted by "SOS" so its length will be multiple of 3.
	 * You could assume the message only contains upper letter.
	 */

public class Robot {

	public int checkMessage(String message) {

		int len = message.length(), i = 0, count = 0;

		while (i < len) {
			if (message.charAt(i++) != 'S')
				count++;
			if (message.charAt(i++) != 'O')
				count++;
			if (message.charAt(i++) != 'S')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Robot mars = new Robot();
		String msg = "SOSSUSSOP";
		int result = mars.checkMessage(msg);
		System.out.println("The number of characters changed by radiation " + result);
	}

}



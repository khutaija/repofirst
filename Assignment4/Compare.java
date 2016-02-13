/**
 * Compare version number. If equal, return 0. if larger, return 1. if smaller,
 * return -1. You could use library functions of Integer and String, like
 * parseInt, split. e.g. "1.2.3" VS "1.2.0" --> 1. "1.2" VS "1.2.0" --> 0.
 * "100.200" VS "200.100" --> -1.
 */

public class Compare {
	public Integer versionCompare(String str1, String str2) {
		String[] vstr1 = str1.split("\\.");
		String[] vstr2 = str2.split("\\.");
		int i = 0;

		while (i < vstr1.length && i < vstr2.length && vstr1[i].equals(vstr2[i])) {
			i++;
		}

		if (i < vstr1.length && i < vstr2.length) {
			int compare = Integer.valueOf(vstr1[i]).compareTo(Integer.valueOf(vstr2[i]));
			return Integer.signum(compare);
		}

		else {
			return Integer.signum(vstr1.length - vstr2.length);
		}
	}

	public static void main(String[] args) {

		Compare call = new Compare();
		String version1 = "1.6.7";
		String version2 = "5.2.3";
		int result = 0;
		result = call.versionCompare(version1, version2);
		System.out.println(result);

	}

}

/**
	 * 4. Open a local file, read the file line by line. Each line should be imported as a
	 * string and stored in ArrayList. Then print out the ArrayList reversely. You can
	 * create your own file to test.
	 */

	 public class ReverseFileLines {

	public static void main(String[] args) throws IOException {
		int count = 0;
		File f = new File("/Users/khutaijashariff/Documents/javaAssignment.txt");
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String str;

		List<String> list = new ArrayList<String>();
		while ((str = br.readLine()) != null) 
			list.add(str);
		
		
		for(int i=list.size()-1; i>=0; i--){
			System.out.println(list.get(i));
		}
		
	
		
	}

}

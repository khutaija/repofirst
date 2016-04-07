import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class CountFilesInDirAndSub {
	static int count = 0;

	public int countFiles(String directory, String extension) {

		File file = new File(directory);
		File[] fileArray = file.listFiles();

		if (file.isDirectory()) {
			for (int i = 0; i < fileArray.length; i++) {

				if (fileArray[i].isDirectory()) {
					countFiles(fileArray[i].getPath(), extension);
				}
				if (fileArray[i].getAbsolutePath().endsWith(extension)) {
					count++;
				}

			}
		}
		return count;

	}

	public static void main(String[] args) {

		CountFilesInDirAndSub call = new CountFilesInDirAndSub();
		int result = call.countFiles("/Users/khutaijashariff/Documents/repofirst", ".java");
		System.out.println(result);
	}

}

public class FileFolderTest {

	public static void main(String[] args) {
	
		Folder folder1  = new Folder("javaPrograms", new Date());
		System.out.println("Name of the folder is " +folder1.getName());
		System.out.println("The folder was created on " +folder1.getDateCreated());
		System.out.println("The size of folder is " +folder1.getSize());
		folder1.rename("pythonPrograms");
		System.out.println("Name of the folder is " +folder1.getName());
		
		
		
		
		File file1  = new File("helloWorld", new Date());
		System.out.println("Name of the file is " +file1.getName());
		System.out.println("The file was created on " +file1.getDateCreated());
		file1.moveFileInto(folder1);
		System.out.println("The size of folder now is " +folder1.getSize());
		
		

	}

}
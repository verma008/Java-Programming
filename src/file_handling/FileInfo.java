package file_handling;

import java.io.File;

public class FileInfo {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\Archana\\Desktop\\text.txt");
		
		if(f.exists())
		{
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getName());
			System.out.println("Size of the file in byte"+f.length());
		}
		else {
			System.out.println("File not exits");
		}
	}

}

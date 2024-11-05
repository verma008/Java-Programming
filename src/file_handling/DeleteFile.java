package file_handling;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\Archana\\Desktop\\abc.txt");
		
		if(f.delete())
		{
			System.out.println("File deleted successfully");
		}else {
		System.out.print("File does not exists");
		}
		
	}

}

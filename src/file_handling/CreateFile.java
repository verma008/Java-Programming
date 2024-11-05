package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
	
	File f=new File("C:\\Users\\Archana\\Desktop\\text.txt");
	
	if(f.createNewFile())
	{
		System.out.println("File" +f.getName() +"created successfully");
	}
	else
	{
		System.out.println("File already exist");
	}
	
	}
}

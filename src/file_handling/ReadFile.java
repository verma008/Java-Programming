package file_handling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
			
		FileReader f=new FileReader("C:\\Users\\Archana\\Desktop\\abc.txt");
		int i;
		try {
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}
		}finally {
			f.close();
			System.out.println("File closed");
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.print("Exception Handled");
		}
		
	}
}

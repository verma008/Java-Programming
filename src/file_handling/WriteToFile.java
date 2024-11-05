package file_handling;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public static void main(String[] args) {
		try {
			
		      FileWriter f=new FileWriter("C:\\Users\\Archana\\Desktop\\abc.txt");  
			
			    try{
				    f.write("I have to make my parents proud.");
			    }finally {
				    f.close();
			    }
			    System.out.println("Content is successfully wrote to the file.");  
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Not able to wrote in file");
		}
		
	}

}

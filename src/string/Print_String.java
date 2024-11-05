package string;

                                             /*ALWAYS REMEMBER: JAVA STRINGS ARE IMMUTABLE */

import java.util.Scanner;

public class Print_String {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any string: ");
		Scanner r=new Scanner(System.in);
		String str=r.nextLine();
		System.out.println("String: "+str);
		
		// length of a String
		System.out.println("Length of the string: "+str.length());
		
		// Access character of a string
		System.out.println("Access character of a string: ");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		
		// The substring of a string is a subpart of it.
		// substring(first index, last index-1)
		System.out.println("Substring: "+str.substring(4));
	}

}

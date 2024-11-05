package string;

import java.util.Arrays;

public class TwoStringAnagram {
	
	public static void main(String[] args) {
		
		
	     String s="LISTEn";
	     String t="SILENT";
	     
	     // Remove white spaces and convert to lower case
	     s=s.replaceAll("\\s", "").toLowerCase();    
	     t=t.replaceAll("\\s", "").toLowerCase(); 
	     
	     if(s.length() != t.length())
	     {
	         System.out.println("Not Anagram");
	         System.exit(0);
	     }
	      
	     // Convert string to character Array.
	     char[] s1=s.toCharArray();
	     char[] t1=t.toCharArray();
	     // Sort both Strings
	     Arrays.sort(s1);
	     Arrays.sort(t1);
	     
	     for(int i=0;i<s1.length;i++)
	     {
	    	 if(s1[i]!=t1[i])
	    	 {
	    		 System.out.println("Not Anagram");
	    		 System.exit(0);
	    	 }
	     }
	     
	     System.out.println("Two strings are Anagram");
	}
}

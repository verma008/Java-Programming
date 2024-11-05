package string;

import java.util.HashMap;
import java.util.Map;

public class StringBasics{
	
	public static boolean isPalindrom(String s2)
	{
		int i=0;
		int j=s2.length()-1;
		while(i<j)
		{
			if(s2.charAt(i)!=s2.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void printVowel(String s4)
	{
		char[] ch=s4.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s4.length();i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
			   ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
			{
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}
	
	private static void firstNonRepeatingCharacter(String s5) {
		
		for(int i=0;i<s5.length();i++)
		{
			
		}
	}
	public static void main(String[] args) {
		
		String str="Erasmith Technology Pvt.Ltd";

		System.out.println(str);
		
		String s=str.substring(0, 8);
		System.out.println(s);
		
		
	    int n=str.length();
		System.out.println(n);
		
// 1. Reverse String
		    // Convert the string to a character array
	        char[] ch = str.toCharArray();

	        int i = 0;
	        int j = str.length() - 1;

	        
	        while (i < j) {
	            char temp = ch[i];
	            ch[i] = ch[j];
	            ch[j] = temp;

	            i++; 
	            j--; 
	        }

	        // Convert the character array back to a string
	        System.out.println(String.valueOf(ch)); 
	        
// 2. Find the Frequency of Characters in a String	        
	        String s1="hello";
	        Map<Character,Integer> map=new HashMap<Character,Integer>();
	        
	        for(int i1=0;i1<s1.length();i1++)
	        {
	        	if(map.containsKey(s1.charAt(i1)))
	        	{
	        		map.put(s1.charAt(i1),map.get(s1.charAt(i1))+1);
	        	}
	        	else
	        	{
	        		map.put(s1.charAt(i1),1);
	        	}
	        }
	        
         System.out.println(map);
         
// 3.  Check if a String is a Palindrome
         String s2="madam";
         String s3="hello";
         System.out.println(isPalindrom(s2));
         System.out.println(isPalindrom(s3));
         
// 4. Count the Number of Vowels in a String
         
         String s4="hello";
         printVowel(s4);
         
// 5. Find the First Non-Repeated Character
         String s5="hhello";
         firstNonRepeatingCharacter(s5);
	}

	
}

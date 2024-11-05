// Java Program to Sort string characters in Alphabetical Order

package string;

import java.util.Arrays;

public class SortStringCharacterAlphabeticalOrder {
	
	public static void main(String[] args) {
		String str="rock";
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			System.out.print(ch[i]);
		}
		
		
		// Approach-2 
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		System.out.println("\nSort String characters in Alphabetical Order: "+(new String(charArray)));
		
	}

}

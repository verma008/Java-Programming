package string;

import java.util.stream.IntStream;

public class AllPosibleSubstrings {

// Approach-1 Brute Force Approach	
//	public static void printAllSubstrings(String str)
//	{
//		int n=str.length();
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<=n;j++)
//			{
//				System.out.println(str.substring(i, j));
//			}
//		}
//	}
	
// Approach-2 Using StringBuilder
//	public static void printAllSubstrings(String str)
//	{
//		int length=str.length();
//		for(int i=0;i<length;i++)
//		{
//			StringBuilder sb=new StringBuilder();
//			for(int j=i;j<length;j++)	
//			{
//                 sb.append(str.charAt(j));
//                 System.out.println(sb.toString());
//			}
//		}
//	}
	
// Approach-3 Using Java Streams(Java-8)
	public static void printAllSubstrings(String str){
		IntStream.range(0, str.length())
		         .forEach(i->IntStream.rangeClosed(i+1, str.length())
		        		 .forEach(j->System.out.println(str.substring(i,j))));
	}
	

	
	public static void main(String[] args) {
	
		String str="abc";
		printAllSubstrings(str);
		
	}
}

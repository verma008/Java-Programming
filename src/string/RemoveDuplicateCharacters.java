package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	
	public static void main(String[] args) {
		
// Approach-1 using a nested loop without converting the string to a character array.
		String str="programming";
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
			boolean repeted=false;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					repeted=true;
					break;
				}
			}
			if(!repeted)
			{
				sb.append(str.charAt(i));
			}
		}

		System.out.println("Removed duplicate Characters from String:"+sb);
		
		
//Approach-1 using a nested loop by converting the string to a character array.	
		
		StringBuilder sbb=new StringBuilder();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			boolean repeted=false;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					repeted=true;
					break;
				}
			}
			if(!repeted)
			{
				sbb.append(ch[i]);
			}
	    }
		System.out.println("Removed duplicate Characters from String:"+sbb);
		
		
// Approah-2 Optimized approach using linkedHashSet(Order should be same while printing)		
		StringBuilder ssb=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c:set)
		{
			ssb.append(c);
		}
		
		System.out.println("Removed duplicate Characters from String: "+ssb.toString());
		
// Approach-3 	Using HashSet (The insertion order is not preserved.)
		StringBuilder ssbb=new StringBuilder();
		Set<Character> sets=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			sets.add(str.charAt(i));
		}
		for(Character c:sets)
		{
			ssbb.append(c);
		}
		
		System.out.println("Removed duplicate Characters from String: "+ssbb.toString());
		
// Approach-4 Using java-8
		StringBuilder sB=new StringBuilder();
		str.chars().distinct().forEach(c->sB.append((char)c));
		System.out.println(sB);
		
// Approach -5 By using indexOf() method
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			int idx=str.indexOf(c,i+1);
			if(idx==-1)
			{
				sb1.append(c);
			}
		}
		System.out.println(sb1);	
  }
}

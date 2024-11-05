package string;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
// Approach-1
		String str="aabcdbe";
		for(int i=0;i<str.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					unique=false;
					break;
				}
			}
			if(unique)
			{
				System.out.print(str.charAt(i));
				break;
			}
		}
		
		
// Approach-2
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.print(map);
		for(Entry<Character, Integer> entrySet: map.entrySet())
		{
			if(entrySet.getValue()==1)
			{
				System.out.println(entrySet.getKey());
				break;
			}
		}
		
	}
}

/* Count frequency of each character in an array using HashMap */
// time complexity= O(n)

package string;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacterString {
	
	public static void main(String[] args) {
		
		String str="hello";
		char[] chars= str.toCharArray();
		 
		 // creating map
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
		 for(char ch: chars)
		 {
			 if(map.containsKey(ch))
			 {
				 map.put(ch, map.get(ch)+1);
			 }else {
				 map.put(ch, 1);
			 }
		 }
		 System.out.println(map);
	}

}

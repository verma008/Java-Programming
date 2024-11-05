/* Java program to find maximum occuring character in a string */

package string;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCharacter {
   
	public static void main(String[] args) {
		
	
	String s="abbbbbccc";
	HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
	
	char c[]=s.toCharArray();
    for(char ch:c)	
    {
         if(hm.containsKey(ch))
         {
        	hm.put(ch, hm.get(ch)+1); 
         }else {
        	 hm.put(ch, 1);
         }
    }
    
    int maxCount=0;
    char maxChar=' ';
    
    for(Map.Entry<Character, Integer> me:hm.entrySet())
    {
    	if(maxCount<me.getValue())
    	{
    		maxCount=me.getValue();
    		maxChar=me.getKey();
    	}
    }
    System.out.println("Maximum repeated character is: "+maxChar);
	}
}

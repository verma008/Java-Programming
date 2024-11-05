package string;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
	
    public static int lengthOfLongestSubstring(String s) {
    	
        // Base case: if the string is empty, return 0
        if (s == null || s.length() == 0) {
            return 0;
        }

       
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0; 
        int end=0;
        
        
        while(start<s.length()) {
            if(!set.contains(s.charAt(start))) {
                set.add(s.charAt(start));
                start++; 
                maxLength = Math.max(maxLength, start-end);
            }
            else {
            	set.remove(s.charAt(end));
            	end++;
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}

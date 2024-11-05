//Given a string s, find the length of the longest substring without repeating characters.
// TimeComplexity: O(2N)  add add and In worst case remove remove
// SpaceComplexity: O(N) in worst case where n is unique element
package sliding_window;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters{

    static int lengthOfLongestSubString(String s)
    {
        int windowStart=0, windowEnd=0,n=s.length(), len=0;
        int maxLength=Integer.MIN_VALUE;
        HashSet<Character> set=new HashSet<>();

        while(windowEnd < n){
            char ch=s.charAt(windowEnd);
            if(set.contains(ch)){
                //Shrinking
                while(windowStart<windowEnd && set.contains(ch)){
                   set.remove(s.charAt(windowStart));
                   windowStart++;
                }
            }
            set.add(ch);
            len=windowEnd-windowStart+1;
            maxLength=Math.max(maxLength, len);
            windowEnd++;
        }
        return (maxLength==Integer.MIN_VALUE)?0:maxLength;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int maxLength=lengthOfLongestSubString(s);
        System.out.println("Longest Substring without repeating character: "+maxLength);

    }
}

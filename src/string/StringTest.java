package string;
import java.util.HashSet;

public class StringTest {

    static int longestSubstring(String str){

        HashSet<Character> set=new HashSet<Character>();
        int windowStart=0,windowEnd=0, maxLength=0, len=0;

        while(windowEnd< str.length()){

            char ch=str.charAt(windowEnd);
            if(set.contains(ch))
            {
                // remove shrinking
                set.remove(str.charAt(windowStart));
                windowStart++;
            }
            set.add(ch);
            len=windowEnd-windowStart+1;
            maxLength=Math.max(len,maxLength);
            windowEnd++;
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s="abcabcbb";
        int i = longestSubstring(s);
        System.out.println("Length of longest substring is: "+i);


    }
}

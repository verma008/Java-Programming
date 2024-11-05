// Given a string s, find the longest palindromic substring in s.  Input:"babad" Output: "bab" OR "aba"
package string;

public class LongestPalindromicSubstring {
    static String longestPalindrome(String str) {
     if(str.length()<=1){
         return  str;
     }

     String LPS="";

     for(int i=1; i<str.length(); i++){
      int low=i,high=i;
      while(str.charAt(low)== str.charAt(high)){
          low--;
          high++;
          if(low==-1 || high == str.length())
              break;
      }
      String palindrome=str.substring(low+1,high);
      if(palindrome.length()>LPS.length()){
          LPS=palindrome;
      }

      // for even length
         low=i-1; high=i;
         while(str.charAt(low)==str.charAt(high)){
             low--;high++;
             if(low==-1 || high==str.length())
                 break;
         }
         palindrome=str.substring(low+1,high);
         if(palindrome.length()>LPS.length()){
             LPS=palindrome;
         }
      }
     return LPS;
    }

    public static void main(String[] args) {
        String str="cbba";
        String s = longestPalindrome(str);
        System.out.println("Longest palindromic substring: "+s);
    }
}

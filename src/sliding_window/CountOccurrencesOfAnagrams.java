/*Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.
Input: txt = forxxorfxdofr , pat = for
Output: 3
Explanation: for, orf and ofr appears in the txt, hence answer is 3.

TC: O(M)for Pattern + O(M+N-M) for first and other window * O(26)
   O(M)+O(N)*O(26)==O(M+N)
SC: O(M) +O(N) to mantain the frequency array for pattern and text
*/
package sliding_window;
import java.util.Arrays;

public class CountOccurrencesOfAnagrams {
    public static int countAnagrams(String pat, String txt){
       int patFreq[]=new int[26];
       int k=pat.length();
       for(int i=0;i<k;i++)
       {
           int index=pat.charAt(i)-97;
           patFreq[index]++;
       }

       int txtFreq[]=new int[26];
        for(int i=0;i<k;i++){
            int index=txt.charAt(i)-97;
            txtFreq[index]++;
        }

        int count=0;
        if(Arrays.equals(txtFreq,patFreq)){
            count++;
        }

        // calc for other window
        int n=txt.length();
        for(int i=1;i< n-k+1;i++){
            int removedCharIndex=txt.charAt(i-1)-97;
            int addedCharIndex=txt.charAt(i+k-1)-97;
            txtFreq[addedCharIndex]++;
            txtFreq[removedCharIndex]--;
            if(Arrays.equals(txtFreq,patFreq)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    String txt = "forxxorfxdofr" , pat = "for";
    int cntAnagram=countAnagrams(pat,txt);
    System.out.println(cntAnagram);
    }
}

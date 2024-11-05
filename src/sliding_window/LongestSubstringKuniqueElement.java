// Given a string, you need to print the size of longest possible substring that has exactly K unique characters.If there is no possible substring present return -1.
// TC: O(N)Expansion+O(N)Shrinking: O(2N) : O(N)
// SC: O(26)

package sliding_window;
public class LongestSubstringKuniqueElement {
	
	static int longestSubstring(String str, int k) {
		// aabacbebebe
	int windowStart=0, windowEnd=0;
	int maxLength=Integer.MIN_VALUE;
	int len=0, uniqueCharCount=0;
	int  frequencyArray[]=new int[26];

	while(windowEnd<str.length())
	{
		// expension // index nikalo
		int index=str.charAt(windowEnd)-97;
		if(frequencyArray[index]==0) {
			uniqueCharCount++;
			frequencyArray[index]++;
		}else{
			frequencyArray[index]++;
		}

		if(uniqueCharCount==k) {
			len=windowEnd-windowStart+1;  //upperLimit-lowerlimit+1
			maxLength=Math.max(maxLength, len);
		} else if(uniqueCharCount>k) {
			// shrinking
			while (windowStart < windowEnd && uniqueCharCount > k) {
				index = str.charAt(windowStart) - 97;
				windowStart++;
				frequencyArray[index]--;
				if (frequencyArray[index] == 0) {
					uniqueCharCount--;
				}
			}
		}
		windowEnd++;
	}
	return (maxLength==Integer.MIN_VALUE)?-1:maxLength;	
	}
	
	public static void main(String[] args) {
		String str= "aabacbebebe";  // ans 7
		int k=3;
		int longSub= longestSubstring(str,3);
		System.out.println(longSub);
	}
}

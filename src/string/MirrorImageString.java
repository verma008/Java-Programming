/*Given a string, look for a mirror image string at both the beginning and end of the given string. 
 * Input str="abXYZba"  Mirror="ab"
Approach:Compare the first and last character.If they match,move to the next character(second & second-last)and continue.
Stop when characters don’t match or you reach the middle of the string or when start and end crossed to each other.
*/

package string;

public class MirrorImageString {
	// Method to find the longest mirror image prefix and suffix
	static String findMirrorImage(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else{
				break; // stop if character don't match
			}
		}
		// The mirror image is the substring from the start of the string to the `start`/ith index
        return str.substring(0, i);
	}
	public static void main(String[] args) {
	   String str1="abXYZba";
	   String str2 = "abcdef";
	   System.out.println("Mirror image in '" + str1 + "' is: " + findMirrorImage(str1)); // Output: "ab" means ab
       System.out.println("Mirror image in '" + str2 + "' is: " + findMirrorImage(str2)); //"" means nothing
		
	}

	
}

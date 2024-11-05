/*Given a string, count the number of words in the string which either end with the charaters 'd' or 's'
 * Input: string ="Netprophets Cyberworks Pvt Ltd"    output: 3
 * */
package string;

public class CountWordsInStringEndsWithSomeCharacter {

	public int findWordsInString(String str) {
		int count=0; 
		String[] words = str.split(" ");   // Split the string into words using space as a delimiter
		for(String word: words) {
			if(word.endsWith("d") || word.endsWith("s")) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str="Netprophets Cyberworks Pvt Ltd";
		
		CountWordsInStringEndsWithSomeCharacter c=new CountWordsInStringEndsWithSomeCharacter();
		int cnt=c.findWordsInString(str);
		System.out.println(cnt);
	}

	
}

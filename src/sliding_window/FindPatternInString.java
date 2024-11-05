//given two string str and pattern. Print starting index of all occurrences of pattern in str.
//str="abaababaab", pattern="aa"

package sliding_window;

public class FindPatternInString {
	
// To print pattern occurrance in sepret line	
	 static void findPatternOccurrences(String str, String pattern){
		int n=str.length();
		int k=pattern.length();
		for(int i=0;i<=n-k;i++)
		{
			if(str.substring(i, i+k).equals(pattern)) {
				 System.out.print("Pattern found at index: " + i);
			}
		}
	}
	
	
// To print output like 2, 7 and avoid last comma	
	private static void findPatternOccurrences1(String str, String pattern) {
		
        int n = str.length();
        int k = pattern.length();
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<=n-k; i++) {
            if (str.substring(i, i+k).equals(pattern)) {
                sb.append(i).append(", ");
            }
        }
        
        // If result is not empty,remove the last comma and space//remove last ", "
        if (sb.length()>0){   
            sb.setLength(sb.length()-2); 
        }
        
        System.out.println(sb.toString());
    }

	
	public static void main(String[] args) {
		String str="abaababaab", pattern="aa";
		findPatternOccurrences(str,pattern);
		findPatternOccurrences1(str,pattern);
		
	}
}

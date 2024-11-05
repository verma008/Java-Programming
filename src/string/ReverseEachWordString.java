package string;

public class ReverseEachWordString {
	
	public static void main(String[] args) {
		
		String str="Archana Verma";
		String[] words=str.split(" ");
		
		String reverseEachWord="";
		
		for(String word:words)
		{ 
			String reverseWord="";
			// reverse word
		    for(int i=word.length()-1;i>=0;i--)
		    {
		    	reverseWord=reverseWord+word.charAt(i);
		    }
		    reverseEachWord=reverseEachWord+reverseWord+" ";
	     }
		System.out.println("Reverse each word in String: "+reverseEachWord);
	}
}

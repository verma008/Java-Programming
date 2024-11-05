// Program to check whether a string is Palindrome or not. Palindrome: Ulta Seedha ek saman like naman
// Time Complexity:O(n) where n is the length of the string, as we only iterate once through half of it.
//Space Complexity:O(1), as only a few extra variables are used.

package string;
import java.util.Scanner;

public class PalindromeString {

//Approach-2
	static boolean isPalindrome(String str){
	int i=0, j=str.length()-1;

	while(i<j){
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++; j--;
	}
	return true;
}

public static void main(String[] args) {
	System.out.println("Enter string to check palindrome or not: ");
	Scanner r = new Scanner(System.in);
	String s = r.nextLine();

//Approach-1
	String rev = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		rev = rev + s.charAt(i);
	}

	if (s.equals(rev)) {
		System.out.println("Palindrome String");
	} else {
		System.out.println("Not palindrome String");
	}

	//calling method2
	System.out.println("Is the string a palindrome? " + isPalindrome(s));
   }
}

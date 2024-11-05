// Java program to remove all special characters from given string.

package string;

public class RemoveSpecialChars {
	
	public static void main(String[] args) {
		
		String str="@@@A44r*ch^%u$4";
		
		// Approach-1 using replaceAll() method
		String normalString=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(normalString);
	}

}

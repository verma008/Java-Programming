// Java program to Remove all White Spaces from given string.

package string;

public class RemoveAllWhiteSpaces {
	
	public static void main(String[] args) {
		
		String str="a  r c     h  u ";
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
	}
}

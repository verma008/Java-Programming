package string;
/*Input a string from the user. Create a new string called 'result' in which you will replace the latter 'e' in the original string with letter 'i'
 * original="eabcdef"; result="iabcdif"
 * original="xyz"; result="xyz"
 *  */

import java.util.Scanner;

public class ReplaceOriginalString {
	public static void main(String[] args) {
		System.out.print("Enter origional string: ");
		Scanner r=new Scanner(System.in);
		String original=r.nextLine();
		String result="";
		if(original.contains("e"))
		{
			result=original.replace("e", "i");
		}else
		{
			result=original;
		}
		System.out.println("Result: "+result);
	}

}

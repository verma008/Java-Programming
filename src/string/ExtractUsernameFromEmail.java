/* input an email from the user. You have to create a username from the email by deleting the part that comes after @. Display that username to the user.
 * email= archana.verma@gmail.com; username=archana.verma
 *  */

package string;

import java.util.Scanner;

public class ExtractUsernameFromEmail {

	public static void main(String[] args) {
		System.out.print("Enter your email: ");
		Scanner r = new Scanner(System.in);
		String email = r.nextLine();

		String username = "";
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				break;
			} else {
				username += email.charAt(i);
			}
		}
		System.out.print("Username: "+username);
	}
}

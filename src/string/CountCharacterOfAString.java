package string;

public class CountCharacterOfAString {

	public static void main(String[] args) {

        
		String str = "The Kiran Academy";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
//			if(str.charAt(i)!=-1)
//			{
//				count++;
//			}
		}
		System.out.println("Count of character in a string= "+count);
	}

}

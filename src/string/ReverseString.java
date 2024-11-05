// First convert string to character array by using the built in Java String Class method toCharArray().
// Then scan the string from end to start , and print the character one by one.

package string;

public class ReverseString {

	public static void main(String[] args) {
	
// Approach -1 Brute Force (For Loop)
		String str="ArchanaVerma";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
		    rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		
	     /*Another way */
		for(int i=str.length()-1;i>=0;i--)  
		{
			System.out.print(str.charAt(i));
		}
 		
		
// Approach-2  Optimized Approach (Using StringBuilder)
		StringBuilder sb1 = new StringBuilder(str);
		String reversed = sb1.reverse().toString();
		System.out.println("\nReversed String: " + reversed);

		
// Approach-3 Using CharArray TimeComplexity-O(n)we traverse the array only once. & SpaceComplexity-O(n)for storing the character array.
		char[] ch=str.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end)
		{
			// Swap characters
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
		}
		String reversed1 = new String(ch);
        System.out.println("Reversed String: " + reversed1);
		
        
 // Approach -4 Using reverse method of ReverseBuffer class
        StringBuffer sb11=new StringBuffer(str);
        System.out.println(sb11.reverse());
	}
}

// There is 3 other way : RecursionTC:O(n2)  SC:O(n),	Java 8 Streams:TC: O(n)  SC:O(n)	Stack:TC: O(n)  SC:	O(n)

/*Time and space complexity for Approach-1
     The space needed for the original string is O(n), where n is the length of the string. The space required for the reversed string is also O(n).
     No additional significant data structures are used.
     
     TimeComplexity: O(n) bcoz we are traversing a loop. Strings are immutable, which means every time you concatenate a string (e.g., reversed += original.charAt(i);),
     a new String object is created. So it is not good approach for memory perspective.
		

Time and Space complexity for Approach -2
	StringBuilder internally uses a dynamic array, and its reverse() method iterates through the string once, swapping characters in place.
	It performs a simple linear pass through the string of length n, thus the time complexity is O(n), where n is the length of the string.
	
	Space Complexity:The StringBuilder stores a copy of the original string, so it requires O(n) space for the dynamic array that holds the characters.
	The final reversed string is stored as a new String object (created with toString()), which also takes O(n) space.
	Overall, no significant additional space is required beyond these.
	Thus, space complexity is O(n)*/

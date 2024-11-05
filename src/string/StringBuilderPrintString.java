package string;

public class StringBuilderPrintString {
	
	public static void main(String[] args) {
		
		// Declaration
		StringBuilder sb=new StringBuilder("Archana");
		System.out.print(sb);
		
		
		// get a character from index
		StringBuilder s=new StringBuilder("aman");
		
	         //get char
		System.out.println("\n"+s.charAt(1));
		
		
		// set a character at index
		sb.setCharAt(0, 'a');
		System.out.println(sb);
		
		
		// insert a character at some index
		s.insert(0, 'A');
		System.out.println(s);
		
		// delete character at some index // last index exclusive hota hai mtlb include nhi hota hai
		sb.delete(0, 1);
		System.out.println(sb);
		
		
		// Append a char -: append means to add something at the end.
		sb.append(" Verma");
		System.out.println(sb);
		System.out.println(sb.length());
	}
	

}

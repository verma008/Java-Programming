// swap two integers using temporary variable.
package array;

public class SwapUsingTempVariable {
	
	 void swap(int a,int b) {
		 
//		 a=b;  //a=8
//		 b=a;  //b=8 dono equal ho gye aur hume swap karna tha that's why tempVariable comes into picture. 
//		 System.out.println("After swapping: ");
//		 System.out.println("a: "+a +" b: "+b);
		 
		 int temp=a;  // temp=5
		 a=b;     // a=8
		 b=temp;    // b=5
		 System.out.println("After swapping using TempVariable: ");
		 System.out.println("a: "+ a +" b: "+b);
		 
	 }
	public static void main(String[] args) {
		int a=5;
		int b=8;
		SwapUsingTempVariable s=new SwapUsingTempVariable();
		s.swap(a,b);
				
	}

}

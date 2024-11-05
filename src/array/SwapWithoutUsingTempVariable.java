// swap two integers without using temporary variable
package array;

public class SwapWithoutUsingTempVariable {
	
	void swap(int a, int b){
		a=a+b;  //9+3=12
		b=a-b;  // 12-3=9
		a=a-b;  // 12-9=3
		System.out.println("After swaping: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	public static void main(String[] args) {
		int a=9;
		int b=3;
		SwapWithoutUsingTempVariable s=new SwapWithoutUsingTempVariable();
		s.swap(a,b);
	}

}

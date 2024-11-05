// Array length:arr.length , length method is used 
// For string length: str.length() method is used

package array;

import java.util.Scanner;

public class Array_Length {
public static void main(String args[])
{
	int n = 0;
	int a[] = new int[2];
	System.out.println("Enter size of array: ");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();
	System.out.println("Enter elements of Array: ");
	for(int i=0;i<2;i++)
	{
		a[i]=r.nextInt();
	}
	System.out.println("Print array elements: ");
	for(int i=0;i<2;i++)
	{
		System.out.println(a[i]+" ");
	}
	System.out.print(a.length);
	
	
}
}

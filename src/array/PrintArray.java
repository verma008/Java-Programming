package array;

import java.util.Arrays;
import java.util.Scanner;
public class PrintArray {
	
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
	    int a[]=new int[n];
	    
	    System.out.println("Enter elements of array: ");
	    for(int i=0; i<a.length;i++)
	    {
	    	a[i]=r.nextInt();
	    }
	    
	    System.out.print("Array elements are: ");
	    for(int i=0; i<a.length;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	    
	    System.out.println("\nArrays elements:"+Arrays.toString(a));
	    
	}

}

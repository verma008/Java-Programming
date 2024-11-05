package array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
	
	public static void main(String[] args) {
		int i,j,n;
		System.out.print("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Array elements are : "+Arrays.toString(a));
		 
		int min=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("\nSmallest element is: "+min);
	}

}

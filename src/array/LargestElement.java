package array;

import java.util.*;
public class LargestElement {
	
	public static void main(String[] args) {
		
		int i,j,n;
		System.out.println("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements of array");
		for(i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		int max=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Largest element is :"+max);
	}

}

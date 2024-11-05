                 /* java program to arrange array elements in ascending order   */
// lets a[5]= 21 34 2 11 10--------------> 2 10 11 21 34

package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAscendingOrder {
	
	public static void main(String[] args) {
		int i,j,n,temp;
		System.out.print("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int[] a=new int[n];
		System.out.print("Enter elements of array: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array in ascending order: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}

// Delete an element from at specified location/position in array.

package array;

import java.util.Scanner;

public class DeleteElementFromLocation {
	
	public static void main(String[] args) {
		
		System.out.println("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Enter position to delete the element: ");
		int pos=r.nextInt();
		for(int i=pos;i<=n-1;i++)
		{
			a[i-1]=a[i];
		}
		n--;
		System.out.println("New array are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}

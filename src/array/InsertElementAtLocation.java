/* Insert a new elements at any specified location/position in a given linear array.  */

package array;

import java.util.Scanner;

public class InsertElementAtLocation {
	
	public static void main(String[] args) {
		int i,n,ele,loc;
		
		System.out.println("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int a[]=new int[n+1];
		
		System.out.println("Enter elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Enter element to be insert: ");
		ele=r.nextInt();
		
		System.out.println("Enter location for inserting the element");
		loc=r.nextInt();
		
		for(i=n-1;i>=loc-1;i--)
		{
			a[i+1]=a[i];
		}
		i++;
		a[i]=ele;
		n++;
		System.out.println("New array are: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
	}

}

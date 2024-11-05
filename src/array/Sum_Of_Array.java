// Java program tofind the sum of given array for i=0 to n sum=sum+a[i]
package array;

import java.util.Scanner;

public class Sum_Of_Array {
	
	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Array elements: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nSum of array:");	
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.print(sum);
		
	}

}

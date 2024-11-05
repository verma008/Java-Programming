/*Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indecis
 * from l to r( both included). The values of l and rin queries follows 1-based indexing.*/
package two_pointer_approach;

import java.util.Scanner;

public class PrintSumOfGivenRange {
	
// Approach1 Brute force approach
	
//	public static int arraySumInGivenRange(int a[])
//	{
//		int sum=0;
//		for(int i=l, i<=r, i++)
//		{
//			sum=sum+a[i];
//		}
//		return sum;
//	}
  
	public static int[] makePrefixSumArray(int a[])
	{	
		for(int i=1 ;i<a.length;i++){
			a[i]=a[i-1] + a[i];
		}
		return a;
	}	

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n=r.nextInt();
		int a[]=new int[n+1];
		
		System.out.println("Enter " + n + " elements: ");
		for(int i=1; i<=n;i++){
			a[i]=r.nextInt();
		}
		
//		arraySumInGivenRange(a);
		int ps[]=makePrefixSumArray(a);
		
		System.out.println("Enter number of queries: ");
		int q=r.nextInt();
		
		while(q-- > 0)
		{
			System.out.println("Enter range: ");
			int l=r.nextInt();
			int e=r.nextInt();
			int ans=ps[e]-ps[l-1];
			System.out.println("Sum of array in given range: "+ ans);
		}
		
	}
}

/* Pattern: Prefix Sums
 * 
 * Given an integer array 'a', return prefix sum/ running sum of the array without creating a new array. */

package two_pointer_approach;


import java.util.Scanner;

public class PrefixSum {

//approach 1 with creating new array
	public static int[] makePrefixSumArray(int a[])
	{
		int pref[]= new int[a.length];
		pref[0]=a[0];
		
		for(int i=1 ;i<a.length;i++)
		{
			pref[i]=pref[i-1] + a[i];
		}
		
		return pref;
	}
	
//approach 2 without creating new array
		public static int[] makePrefixSumArray1(int a[])
		{	
			for(int i=1 ;i<a.length;i++){
				a[i]=a[i-1] + a[i];
			}
			return a;
		}	
	
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+ n +" elements: ");
		for(int i=0;i<n ;i++){
			a[i]=r.nextInt();
		}
		
		System.out.println("Origional array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nPrefix sum array: ");
		int pr[]=makePrefixSumArray(a);
		for(int i=0;i<pr.length;i++)
		{
			System.out.print(pr[i]+" ");
		}
		System.out.println("\nPrefix sum array: ");
		int pr1[]=makePrefixSumArray1(a);
		for(int i=0;i<pr1.length;i++)
		{
			System.out.print(pr1[i]+" ");
		}
	
	}

}
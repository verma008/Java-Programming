//Find the total number of pairs in the array whose sum is equal to the given value.
package array;

import java.util.Scanner;

public class TargetPairSum{

	public int pairSum(int a[], int targetSum)
	{    
		int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1; j<a.length;j++)
	    	{
	    		if(a[i]+a[j]==targetSum)
	    			count ++;
	    	}
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		
		TargetPairSum tps=new TargetPairSum();
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int n= r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+ n+ "elements: ");
		for(int i=0;i<n;i++){
			a[i]=r.nextInt();
		}
		
		System.out.println("Enter target sum: ");
		int targetSum=r.nextInt();
		
		
		int sum= tps.pairSum(a,targetSum);
		System.out.println("Number of pairs available in the array: "+sum);
		
	}
}

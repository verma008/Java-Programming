/* Problem Statement:
Given an array A[] of positive integers of size N,where each value represents the number of chocolates in a packet.Each packet can have a variable number of chocolates.
There are M students,the task is to distribute chocolate packets among M students such that:
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

TC:O(nlogn)for sorting + O(N-M) for loop--->O(nlogn)max TC2no me se,where n is number of elements. SC:depends on sorting algorithm that we are using, here it is constant bcoz we are not using any space.
Approach: 1. Sort the array.
          2. Traverse array through sliding window approach loop.
          3. Find difference between maximum and minimum student.
          4. store it in result and  return result array.   */
package sliding_window;
import java.util.Arrays;

public class ChocolateDistributionProblem {
	static int minimumDiffChocolateDistribution(int[] a, int m) {
		// edge case
		if(a.length==0){
			return 0;
		}
		
		Arrays.sort(a); 

		int n=a.length;
		int res=Integer.MAX_VALUE;
		for(int i=0; i<n-m+1; i++) {
			int minNummer= a[i];
			int maxNumber= a[i+m-1];
			int diff=maxNumber - minNummer;
			res=Math.min(res, diff);
		}
		return res;
	}
	
	public static void main(String[] args) {	 
		int a[] = {3, 4, 1, 9, 56, 7, 9, 12};
		int m=5;
		int diffChocolateDistribution = minimumDiffChocolateDistribution(a,m);
		System.out.println("Difference between Max & Min Student Chocolate Distribution: "+diffChocolateDistribution);
	}
}

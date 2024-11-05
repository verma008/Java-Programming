//Given an array of integers, find all pairs in the array that sum up to a specific target.

package array;

import java.util.HashSet;

public class FindArrayPairsWhichSumEqualsGivenTarget {
	
//Approach-1  Brute-Force Approach Time Complexity: O(n^2) Space Complexity: O(n)
	public static void findPairs(int arr[], int target) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                }
			}
		}
		
	

//Approach-2 Optimized Approach  Time Complexity O(n) Space Complexity: O(n)
		HashSet<Integer> set=new HashSet<Integer>();
		for(int num:arr)
		{
			int remaining=target-num;
			if(set.contains(remaining))
			{
				System.out.println("Pair: (" +num+" , "+remaining +")");
			}
			set.add(num);
		}
}

public static void main(String[] args) {
		
		int arr[]= {2, 4, 3, 7, 5, 8,6};
        int target = 10;
        findPairs(arr, target);
	}
}

//Find a subarray that sums up to a given number.
package array;

import java.util.Arrays;


public class SubarrayWithGivenSum {


public static int[] findSubarrayWithSum(int[] arr, int k) {

// Approach-1 Brute Force Time Complexity:O(n²) since we are checking all possible subarrays (with two nested loops).
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=0;j<arr.length;j++)
		{
			sum=sum+arr[j];
			if(sum==k)
			{
				return Arrays.copyOfRange(arr, i, j+1);
			}
		}
	}
	// Return an empty array if no subarray is found
    return new int[]{};
}

public static void main(String[] args) {
    int[] arr = {10, 2, -20, 10};
    int k = -10;

    int[] result = findSubarrayWithSum(arr, k);

    if (result.length> 0) {
        System.out.println("Subarray with sum " + k + ": " + Arrays.toString(result));
    } else {
        System.out.println("No subarray found.");
    }
  }
}

// Given an array of integers Arr of size N and a number K. Return the maximum sum of a SubArray of size K.
// We have solved this problem using sliding window approach. Note: A SubArray is a contiguous part of any given array.
// Time Complexity: k+n-k= O(n)  Space Complexity: constant
package sliding_window;

public class MaximumSumOfSubarrayOfSizeK {
	
	static long maximumSubArraySum(int[] arr,int n, int k) {

//Approach1: BruteForce approach  TC:(n-k)k=nk-k^2  SC:Nothing
	int maxSum=0;
    for(int i=0; i<=n-k;i ++){  //n-k
		int sum=0;
		for(int j=i; j<i+k; j++){   //k
			sum=sum+arr[j];
		}
		maxSum=Math.max(maxSum,sum);
	}
//    return maxSum;

//Approach-2 Sliding window approach
		long sum=0, maxSum1=0;
	    int index=0;

	    //First, find sum of k elements
	    while(index<k && index<n){ //k
	    	sum=sum+arr[index];
	    	index++;
	    }
	    maxSum1=sum;

	    //For other elements
	    for(int i=1; i<n-k+1; i++){  // i<=n-k
			sum = sum - arr[i-1]+ arr[i+k-1];// sum me se Pichhe vale ko htana and Aage vale ko add karna
			maxSum1 = Math.max(maxSum1, sum);
		}
		return maxSum1;
	}
	
	public static void main(String[] args) {
	     int arr[]= {100,200,300,400};   //maxSum:700
		 int n=4,k=2;
		 long maxSum=maximumSubArraySum(arr,n,k);
		 System.out.println("The maximum sum of a SubArray of size K is: "+maxSum);
	}

}

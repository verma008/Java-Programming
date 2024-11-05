//Given an array of integers A[] and a number x,find the smallest SubArray Length with sum greater than the given value.If such a subArray do not exist return 0 in that case.
//TC:O(N) for expansion + O(N)Shrinking , Total O(N) + O(N) = O(2N) it equivalent to O(N)       SC:O(1)Constant
package sliding_window;

public class SmallestSubarrayWhoseSumGreaterTheanX {

	static int smallestSubarraySumGTX(int[] a,int x) {
		
		int windowStart=0, windowEnd=0;  //wS:LowerLimit, wE:UpperLimit
		int minLength=Integer.MAX_VALUE;
		int len=0, sum=0;

		while(windowEnd<a.length){

			// expansion
			sum=sum+a[windowEnd];
			if(sum>x){
				len=windowEnd-windowStart+1;  //length=UpperLimit-LowerLimit+1
				minLength=Math.min(minLength, len);
				
				// shrinking
				while(windowStart<windowEnd && sum>x) {
					sum=sum-a[windowStart];
					windowStart++;
					if(sum>x)
					{
						len=windowEnd-windowStart+1;
						minLength=Math.min(minLength, len);
					}
				}
			}
			windowEnd++;
		}
		return (minLength==Integer.MAX_VALUE)?0:minLength;
	}
	
	public static void main(String[] args) {
		int a[]= {1,4,45,6,0,19};
		int x=51;
		int lenSmallestSubarray=smallestSubarraySumGTX(a,x);
		System.out.println("The length of smallest subarray with sum greater than the given value X: "+ lenSmallestSubarray);
	}

	

}

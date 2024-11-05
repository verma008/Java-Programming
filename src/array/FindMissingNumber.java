/* Find the Missing Number in an Array
 
Problem: An array contains integers from 1 to n with one number missing. Find the missing number.

For example: Array: {1, 2, 4, 5, 6} (missing number is 3)
*/

package array;

public class FindMissingNumber {
	
	
//Optimized approach 
		/* Time Complexity: 𝑂(𝑛), Space Complexity: 𝑂(1)
	    Pros: Optimal time and space complexity. Simple and efficient.  Cons: May encounter integer overflow for large n*/
	
		public static int missingNumber(int arr[])
		{
			int n=arr.length+1;
			int sumofnnumber=n*(n+1)/2;
			int arraysum=0;
			for(int num:arr)
			{
			    arraysum+=num;	
			}
			return sumofnnumber-arraysum;	
		}
		
		public static void main(String[] args) {
			
			int arr[]= {3,2,1,5,4,7,6,9};
			System.out.println("Missing number is: "+missingNumber(arr));
		}
}

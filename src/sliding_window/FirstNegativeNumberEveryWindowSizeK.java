//Given an array A[] of size N and a positive integer K,Find first negative number in every window(Contiguous SubArray) of size k.
package sliding_window;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberEveryWindowSizeK {
	
	static long[] printFirstNegativeNumber(long[] a, int n, int k){

//Approach1 BruteForce TC: (N-k).k=Nk-K^2  SC:N-k it's asked by algo,humne koi space nhi use kra hai to constant h - O(1)
     long res[]=new long[n-k+1];
     for(int i=0;i<=n-k;i++) {
		 for(int j=0; j<k;j++) {
			 long ele=a[i+j];
			 if(ele<0)
			 {
				 res[i]=ele;
				 break;
			 }
		 }
	 }
//	 return res;

//Approach2- Optimized using sliding window TC:(N-K)+k=O(N), Expected Auxiliary Space:O(k) for queue creation, SC: O(n-k+1) + O(k)
		Queue<Long> queue=new LinkedList<Long>();   //insertion at rear-end & deletion at first-end
		// Calculate for first window
		int index=0;
		while(index<k){
			if(a[index]<0){
				queue.offer(a[index]);// add neg no. in queue
			   }
			index++;
		}
		
		long result[]=new long[n-k+1];
		result[0]=(queue.isEmpty())?0:queue.peek();  //result ke 0 index par element store karna.

		// for others
		for(int i=1; i<n-k+1; i++) {
			// remove
			if(a[i-1]<0){
				queue.poll();   //jo pichhe ke element ko remove karna hai agar wo negative number hai to remove(poll()) karna queue se
			}
			// add
			if(a[i+k-1]<0){
				queue.offer(a[i+k-1]);  // offer() add karna new element ko queue me
			}
			result[i]=(queue.isEmpty())?0:queue.peek();
		}
		return result;
	}
	
	public static void main(String[] args) {
		long a[]= {12,-1,-7,8,-15,30,16,28};   //res=[-1,-1,-7,-15,-15,0]
		int n=8,k=3;
		long[] firstNegativeNumber = printFirstNegativeNumber(a,n,k);
		System.out.println(Arrays.toString(firstNegativeNumber));
	}
}

	



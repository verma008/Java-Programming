// Java program to rotate the array to the right by k steps.Note: Where k is larger than n as well.
// Step 1: Reverse the entire array
// Step 2: Reverse the first k elements
// Step 3: Reverse the remaining elements
package array;

import java.util.Scanner;

public class RotateAnArrayRightByKSteps {

//Approach1 using an extra ans[] array
    static int[] rotate(int a[], int k) {
    	int n=a.length;
    	k=k%n;
    	int ans[]=new int[n];   // ans array declare kra
    	int j=0;
    	for(int i=n-k;i<n;i++)  // k elements(from n-k to n-1) ko array ke starting me laye and ans[] array me store kar diya
    	{
    		ans[j]=a[i];
    		j++;
    	}
    	for(int i=0;i<n-k;i++)  // remaining element from 0 to n-k-1 tak ko ans array me store kar diya
    	{
    		ans[j++]=a[i];
    	}
    	return ans;  // last means array ko return kar diya
    }
    
// Approach-2 Without using extra array
    static void rotateInPlace(int[] a, int k) {
        // Handle cases where k is larger than the array length
    	int n=a.length;
        k = k % n;
        
        reverse(a, 0, n-k-1);   //pahle array ko 2 bhago me devide kiya from k position. and then array ke first bhag ko reverse kra 
        reverse(a, n-k, n-1);   // array ke second bhag koreverse kra
        reverse(a, 0, n-1);     // then pure array ko reverse kar diya
    }

    static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
     }
  }

    
    static void printArray(int a[]) {
    for(int i:a)
    {
    	System.out.print(i+" ");
    }
   }
	public static void main(String[] args) {
//		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
//	     int k = 3;
//	     int[] ans = rotate(arr, k);
//	     System.out.println("Array after rotating by " + k + " steps:");
//	     for (int a : ans) {
//	         System.out.print(a + " ");
//	     }
	     
	     System.out.println("Enter array size: ");
	     Scanner r=new Scanner(System.in);
	     int n=r.nextInt();
	     int a[]=new int[n];
	     System.out.println("Enter "+n+ " elements  " );
	     for(int i=0;i<n;i++){
	    	 a[i]=r.nextInt();
	     }
	     
	     System.out.println("Enter k");
	     int k=r.nextInt();
	     
	     System.out.println("Array after rotating by k steps: ");
	     int ans[]=  rotate(a,k);
	     printArray(ans);
	}
}

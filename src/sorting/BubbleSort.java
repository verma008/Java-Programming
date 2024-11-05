/* Time Complexity
 * Best case: O(n)
 * Worst case: (n-1)(n-1)-> O(n2)*/

package sorting;

public class BubbleSort {
	
	public static void main(String[] args) {

		int A[] = { 21, 12, 23, 34, 13 };
		int n = A.length;

		// Bubble sort
		for (int i = 0; i < n - 1; i++) // pass ke liye kitne no of pass hai(kitne time iteration chlega)
		{
			int flag=0;
			for (int j = 0; j < n - 1 - i; j++) // comparison ke liye
			{
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
					flag=1;
				}
			}
			if(flag==0)  // No Swapping done means array sort ho gyi 1-2 pass ke baad so no need to compare remaing no.
			{
				break;
			}	
		}
     System.out.print("Sorted array using bubble sort: ");
     for(int i=0;i<n;i++)
     {
    	 System.out.print(A[i]+" ");
     }
     
     
	}
}

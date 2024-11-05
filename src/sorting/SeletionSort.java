/*Time complexity: Best case, averagge case, worst case=O(n2)
 *The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning. 

The algorithm maintains two subarrays in a given array.
1. The subarray which already sorted. 
2. The remaining subarray was unsorted.

In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 
Example:  arr[] = {64, 25, 12, 22, 11}
1st Pass: arr[] = {11, 25, 12, 22, 64}*/

package sorting;

public class SeletionSort {
	
	public static void main(String[] args) {
		
		int a[]= {2,8,9,4,6,1};
		int n=a.length;
		int i,j,smallest,temp;
		
		// seletion sort
		for(i=0;i<n-1;i++)
		{
			smallest=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[smallest])
				{
					smallest=j;
				}
			}
				temp=a[i];
				a[i]=a[smallest];
				a[smallest]=temp;	
		}
		
		System.out.print("Sorted array using Selection Sort: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

/*Time Complexity
Worst : O(n^2)
Average : O(nlogn)

Worst case occurs when pivot is always the smallest or the largest element.
 * */

package sorting;

public class QuickSort {
	
	public static void quickSort(int a[],int start,int end)
	{
		if (start < end) {
			
            // Partition the array and get the pivot index
            int pivotIndex = partition(a, start, end);
     
            // Recursively sort the elements before and after the pivot
            quickSort(a,start, pivotIndex - 1);  
            quickSort(a, pivotIndex + 1, end); 
        }
    }

    // Partition method
    private static int partition(int[] a, int start, int end) {
        int pivot = a[start];  // Choose the first element as pivot
        int i =start;  
        int j=end;
        // Traverse through the array
        while(i<j){
            // If the current element is smaller than or equal to pivot
            while(i<end && a[i] <= pivot) {
                i++;
            }while(a[j]>pivot )
            {
            	j--;
            }
            if(i<j)
            {
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        
        // Swap the pivot element with the element at index j
        
        a[start] = a[j];
        a[j] = pivot;
        
        return j; // pivot index
    }
	
	
	public static void main(String[] args) {
		
		int a[]= { 2,9,4,7,12,43,1};
		int n=a.length;
		quickSort(a,0,n-1);

        // print
		System.out.println("Sorted array using Quick Sort");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
		
	}
}



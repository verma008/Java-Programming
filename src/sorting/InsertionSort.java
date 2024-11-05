/*Time complexity: Best case:O(n), averagge case, worst case=O(n2)
 * 
 *  Idea: Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly. 
Time Complexity: O(N2) */

package sorting;

public class InsertionSort {
    
	public static void main(String[] args) {
		 int a[]= {2,4,9,8,1,7};
		 int n=a.length;
		 int j,unsortedElement;
		 
		 // insertion sort logic
		 for(int i=1;i<n;i++)
		 {
			 unsortedElement=a[i];
			 j=i-1;
			 while(j>=0 && unsortedElement<a[j])
			 {
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=unsortedElement;
		 }
		 
		 System.out.print("Sorted array using Insertion sort: ");
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	}
}

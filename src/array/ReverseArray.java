//Java program to print array elements in reverse order :just traverse the loop in reverse order,it will print the array elements in reverse order, but it doesn't modify the original array itself. 
//It simply prints the elements from the last index to the first without changing the array in memory.The array a[] itself is not modified, it’s just printed in reverse order.

package array;

public class ReverseArray {
	
	public static void main(String args[])
	{
		
		int[] a = {1, 2, 3, 4, 5};
		System.out.print("Array elements in Reverse Order: ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
//Approach-1 To reverse array eleements,creating a new array and then copying elements from the original array in reverse order.
		// TimeComplexity=O(n)  Space Complexity=O(n) used an extra array to store the reversed elements.
		
		int[] reversedArr = new int[a.length];
		int j=0;

        // Copy elements from the original array to the new array in reverse order
		for (int i = a.length-1; i >= 0; i--) {
			reversedArr[j]=a[i];
			j++;
	    }
		
        System.out.print("\nReversed array (Brute Force): ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
           }
	    
       
//Approach-2 Optimized(In-Place) reverses the array in place using a two-pointer technique.You swap the elements from the beginning and the end of the array until the middle is reached.
     //TC: O(n)–traversed the array once. SC: O(1)–No extra space is required other than a temporary variable for swapping.This code actually modifies the array in memory, so a[] is reversed.
        
        int start = 0, end = a.length - 1;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        // Print the reversed array
        System.out.print("\nReversed array (Optimized): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
	 
	}
}


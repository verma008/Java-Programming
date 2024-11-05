package array;
import java.util.Arrays;


public class MergeTwoSortedArrays {

// Approach-1 One extra array is used to store the elements.	
	    //TC: O(n+m) is for copying the elements from arr1[] and arr2[] to arr3[]. SC: O(n+m) as we use an extra array of size n+m.
	    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
	    	
	        int size1 = arr1.length;
	        int size2= arr2.length;
	        
	        int[] mergedArray = new int[size1 + size2];
	        
	        int i,j,k;
	        
	        // Merge the arrays
	        for(i=0,j=0,k=0;i<size1 && j<size2;k++)
	        {
	            if (arr1[i] < arr2[j]) {
	                mergedArray[k] = arr1[i];
	                i++;
	            } else {
	                mergedArray[k] = arr2[j];
	                j++;
	            }
	        }
	        
	        // If arr1 still has elements, add them
	        while (i < size1) {
	            mergedArray[k] = arr1[i];
	            i++;
	            k++;
	        }
	        
	        // If arr2 still has elements, add them
	        while (j < size2) {
	            mergedArray[k] = arr2[j];
	            j++;
	            k++;
	        }
	        
	        return mergedArray;
	    }

	    
	    
// Approach-2 Without using any extra space.	
	    // Time Complexity: O(min(n, m)) + O(n*logn) + O(m*logm), where n and m are the sizes of the given arrays.
	    //Reason: O(min(n, m)) is for swapping the array elements. And O(n*logn) and O(m*logm) are for sorting the two arrays.
	    //Space Complexity: O(1) as we are not using any extra space.
	    
	    public static void merge(int[] arr1, int[] arr2) {
	    		 
	        int i=0; int j=0; int k= arr1.length-1;
	       
	        while(i<arr1.length && j<arr2.length)
	        {
	        	if(arr1[i]<arr2[j])
	        	{
	        		i++;
	        		continue;
	        	}
	        	else {
	        		int temp=arr1[k];
	        		arr1[k]=arr2[j];
	        		arr2[j]=temp;
	        		k--;
	        		j++;
	        	}
	        }
	        
	        
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        
	    }
	        
	        
	    
	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5, 7};
	        int[] arr2 = {2, 4, 6, 8};
	        
	        // call approach-1
	        int[] result = mergeSortedArrays(arr1, arr2);
	        System.out.println("Merged array: " + Arrays.toString(result));
	        
	        // call approach-2
	        merge(arr1,arr2);
	        System.out.println("The merged arrays are:");
	        System.out.print("arr1[] = ");
	        for (int i = 0; i < arr1.length; i++) {
	            System.out.print(arr1[i] + " ");
	        }
	        System.out.print("\narr2[] = ");
	        for (int i = 0; i < arr2.length; i++) {
	            System.out.print(arr2[i] + " ");
	        }
	        
	}
}	    
	    




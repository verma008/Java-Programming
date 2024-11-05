// Given an array, move all zeros to the end while maintaining the relative order of the non-zero elements.

package array;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void moveZerosToEnd(int[] arr) {
    	
        
        int count = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZerosToEnd(arr);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}

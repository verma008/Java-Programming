// Java program to find Common element between two array.  Time Complexity: O(n * m), where n is the size of the first array and m is the size of the second array.
// Time Complexity: O(n + m), where n is the size of the first array and m is the size of the second array.

/*
package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindCommonElementBetweenTwoArray {

    public static void main(String[] args) {

        int arr1[] = {1, 4, 7, 9, 3};
        int arr2[] = {4, 8, 12, 45, 7};

        // Brute force approach
        ArrayList<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    commonElements.add(arr1[i]);
                    break; // Break to avoid duplicates
                }
            }
        }
        System.out.println("Common Elements (Brute Force): " + commonElements);

        // Optimized approach
        HashSet<Integer> set = new HashSet<>();
        List<Integer> commonElementSet = new ArrayList<>();

        // Add all elements of the first array to the set
        for (int array1 : arr1) {
            set.add(array1);
        }

        // Check elements of the second array in the set
        for (int array2 : arr2) {
            if (set.contains(array2)) {
                commonElementSet.add(array2);
                set.remove(array2); // To avoid duplicates
            }
        }

        System.out.println("Common Elements (Optimized with Set): " + commonElementSet);
    }
}
*/

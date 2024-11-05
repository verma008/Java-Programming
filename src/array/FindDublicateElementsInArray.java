package array;
/* Brute Force Approach:TC: O(n^2) - Kyunki har element ko baaki sab elements ke saath compare karna padta hai.
SC: O(k) - Duplicates ko store karne ke liye extra space.
Optimized Approach:Samay Jatilta: O(n) - Kyunki hum array ko sirf ek baar traverse karte hain.
Sthaan Jatilta: O(n) - HashSet aur duplicates ko store karne ke liye extra space chahiye.*/


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FindDublicateElementsInArray {

	// Brute Force Approach
	public static void main(String[] args) {

		int array[] = { 1, 3, 5, 4, 1, 5, 5 };

		ArrayList<Integer> dublicateList = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && !dublicateList.contains(array[i])) {
					dublicateList.add(array[i]);
					break;
				}
			}

		}
		System.out.println("Dublicates: " + dublicateList);

		// Oprimized Approach
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> duplicates = new ArrayList<>();
		for (int num : array) {
			if (!set.add(num)) {
				duplicates.add(num);
			}

		}
		System.out.println("Duplicates: " + duplicates);
	}

}

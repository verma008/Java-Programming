package two_pointer_approach;

import java.util.Scanner;

public class SortSquares {
	
	private static int[] sortSquares(int[] a) {
		int n=a.length;
		int start=0, end=n-1;
		int ans[]=new int[n];
		int k=n-1;
		
		while(start<=end) {
			if(Math.abs(a[start])>Math.abs(a[end])) {
				ans[k]=a[start]*a[start];
				k--;
				start++;
			}else {
				ans[k]=a[end]*a[end];
				k--;
				end--;
		}
		}
		return ans;
		
	}
	
	static void printArray(int a[]) {
		for(int i=0;i< a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner r =new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=r.nextInt();
		int a[]=new int[n];
	
		System.out.println("Enter "+n+ " elements: ");
		for(int i=0; i<n; i++) {
			a[i]=r.nextInt();
		}
		
		int[] sortSquares = sortSquares(a);
		
		System.out.println("Origional array: ");
		printArray(a);
		
		System.out.println("\nSorted Array: ");
		printArray(sortSquares);
      
		
		
	}

	
}

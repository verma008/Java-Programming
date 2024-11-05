/*given an array of integers 'a', move all the even integers at beginning of the array followed by odd integers
  The relative order of odd or even integers does not matter.Return any array that satisfy the condition*/
package two_pointer_approach;

import java.util.Scanner;

public class SortArrayByParity {
	
	static void printArray(int a[]){
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	 static void swap(int a[],int i,int j){
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
	 }
	
	static void sortArrayByParity(int a[]){
		int n=a.length;
		int start=0, end=n-1;
		while(start<end)
		{
		    if(a[start] %2 == 1 && a[end] %2 == 0) {
		    	swap(a,start,end);
		    }
		
		
		if(a[start] %2 == 0) {
			start++;
		}
		
		if(a[end] %2 == 1)
		{
			end--;
		}
	}
	}
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+n+" elemets: ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		
		System.out.println("Origional array: ");
		printArray(a);
		
		sortArrayByParity(a);
		System.out.println("\nSorted array :");
		printArray(a);
	}

}

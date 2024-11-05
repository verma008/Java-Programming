package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
	
		
// Q1 Find the Largest and Smallest Element in an Array
		int a[]= {1,6,8,9,3,2};
		int max=a[0];
		int min=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
				 max=a[i];
			 else if(a[i]<min)
			 {
				 min =a[i];
			 }
		 } 
		 System.out.println("Max: "+max);
		 System.out.println("Min: "+min);
	
		 
// Q2 Reverse an Array
		 int start=0;
		 int end=a.length-1;
		 
		 while(start<end)
		 {
			 int temp=a[start];
			 a[start]=a[end];
			 a[end]=temp;
			 start++;
			 end--; 
		 }
		 
		 System.out.println("Reversed Array: ");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 
		 
// Q3 Remove Duplicates from Sorted Array
		 int a1[]= {1,2,3,3,4,4,5};
		 ArrayList<Integer> list=new ArrayList<>();
		 HashSet<Integer> sets=new HashSet<>();
		 for(int i=0;i<a1.length;i++)
		 {
			 sets.add(a1[i]);
		 }
		 
		for(int set:sets )
		{
		    list.add(set);
		}
		 System.out.println("\nRemoved duplicate elements: "+list);
	
	
	
// Q4 Rotate an Array: Rotate the array by k steps to the right.
		 
// Q5 Find Missing Number in an Array
		//An array contains integers from 1 to n with one number missing. Find the missing number.	
		 int arr[]= {3,2,1,5,4,7};
			
		
				int n=arr.length+1;
				int sumOfNnumber=n*(n+1)/2;
				int arraySum=0;
				for(int num:arr)
				{
				    arraySum+=num;	
				}
				int missingNumber=sumOfNnumber-arraySum;
				System.out.println("Missing number is: "+missingNumber);
				
// Q6 Move Zeros to the End.				
			
// Q7 Merge Two Sorted Arrays into one sorted array without using extra space.			
			
				int[] arr1 = {1, 3, 5, 7};
		        int[] arr2 = {2, 4, 6, 8};
		        
		        int i=0,j=0,k=arr1.length-1;
		        while(i<arr1.length && j<arr2.length)
		        {
		        if(arr1[i]<arr2[j])
		        {
		            i++;
		            continue;
		        }else
		        {
		        	int temp=arr1[k];
		        	arr1[k]=arr2[j];
		        	arr2[j]=temp;
		        	k--;
		        	j++;
		        }      
		        }
		        Arrays.sort(arr1);
		        Arrays.sort(arr2);
		        
		        System.out.println("The merged arrays are:");
		        System.out.print("arr1[] = ");
		        for (int p = 0; p< arr1.length; p++) {
		            System.out.print(arr1[p] + " ");
		        }
		        System.out.print("\narr2[] = ");
		        for (int q = 0; q < arr2.length; q++) {
		            System.out.print(arr2[q] + " ");
		        }
		        
// Q8 Find All Pairs with a Given Sum		        
	}
}

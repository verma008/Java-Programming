package array;

import java.util.Arrays;

public class FirstAndSecondLargest {
	
	
	// Bruth Forch Approach
  public static void main(String[] args) {
	  
	  // Sort the array
	  int arr[]= {2,4,6,8,9,12,45};
	  Arrays.sort(arr);
	  // First largest element 
	  
	  System.out.println("First largest element in the array: "+arr[arr.length-1]);
	  System.out.println("Second largest element in the array: "+arr[arr.length-2]);
	  
	  
	  // Optimized Approach   
	  /* Jab hum array ke kisi element ko dekhte hain, agar wo firstLargest se bada hota hai, to hum firstLargest ko secondLargest bana dete hain,
	    aur naye element ko firstLargest bana dete hain. Agar wo element firstLargest se chhota hai, lekin secondLargest se bada hai, 
	    to hum usse secondLargest bana dete hain. */
	  
	  int firstLargest=Integer.MIN_VALUE;
	  int secondLargest=Integer.MIN_VALUE;
	  
	  
	  for(int num: arr)
	  {
		  if(num>firstLargest)
		  {
			  secondLargest=firstLargest;
			  firstLargest=num;
		   }else if (num>secondLargest && num != firstLargest)
		   {
	          secondLargest = num;
	       }  
	  }  
	   System.out.println("First Largest: " + firstLargest);
	   System.out.println("Second Largest: " + secondLargest);
     }
}

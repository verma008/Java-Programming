package searching;

//example of binary search using Arrays.binarySearch()

import java.util.Arrays;

public class binarySearchMethod {
	
 public static void main(String[] args) {
	 
     int a[]={10,20,30,40,50};
     int key=300;
     
     int result= Arrays.binarySearch(a,key);
     
     if(result>=0)
     {
    	 System.out.println("Element found at index: "+result);
     }
     else
     {
         System.out.println("Element not found");
     }


 }
}


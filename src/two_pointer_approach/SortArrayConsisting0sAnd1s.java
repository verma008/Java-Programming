// Sort an array consisting of only 0s and 1s

package two_pointer_approach;
import java.util.Scanner;

public class SortArrayConsisting0sAnd1s {
	
	static void printArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
// Approach 1: 
    static void sortZerosAndOnes(int a[]){
    	int n=a.length;
    	//count number of zeros
    	int count=0;
    	for(int i=0;i<n;i++){
    		if(a[i]==0){
    			count++;
    		}
    	}
    	
    	// 0 to count-1:0 and count to n-1:1
    	for(int i=0;i<n;i++){
    	     if(i<count)
    	     {
    	    	 a[i]=0;
    	     }else {
    	    	 a[i]=1;
    	     }
    	}
    }
	
    static void swap(int a[], int i, int j){
    	int temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    }
    
// Approach2 two pointer approach
    static void sortZerosAndOnes1(int a[]) {
    	int n=a.length;
    	
    	int start=0, end=n-1;
    	while(start<end){
    		if(a[start]==1 && a[end]==0){
    			swap(a,start,end);
    			start++;
    			end--;
    		}
    		
    		if(a[start]==0){
    			start++;
    		}
    		
    		if(a[end]==1){
    			end--;
    		}
    	}
    }
    
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter " +n+ " elements: ");
		for(int i=0;i<n;i++){
			a[i]=r.nextInt();
		}
		
		System.out.println("Origional array:");
		printArray(a);
		
		sortZerosAndOnes(a);
		System.out.println("\nSorted array: ");
		printArray(a);
		
		sortZerosAndOnes1(a);
		System.out.println("\nSorted array: ");
		printArray(a);
	
	}
}

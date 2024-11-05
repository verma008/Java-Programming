// Find largest and Smallest element in the given Array.
// one for loop time complexity O(n) Space complexity O(1)

package array;

public class FindLargestAndSmallestElement {
	
	public static void main(String[] args) {
		
		int a[]= {34,67,89,98,4,2,23,1,100};
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)  
		{
			if(a[i]>max)
			{
				max=a[i];
			}else if (a[i]<min){
				min=a[i];
			}
		} 
		System.out.println("Smallest Element in the array:"+min);
		System.out.println("Largest Element in the array:"+max);
	}

}

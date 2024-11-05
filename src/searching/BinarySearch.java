                         /* Iterative Implementation of Binary Search */
/*
Time Complexity= 
    Best Case:O(1)
    Average Case: O(log n)
    Worst Case: O(log n)
Auxiliary space= O(1)
 */

package searching;

public class BinarySearch {
	
	public static int BinarySearch(int a[], int ele)
	{
		int n=a.length;
		int l=0,r=n-1,mid;
		while(l<=r)
			{
				mid=(l+r)/2;      // mid=start+(end-start)/2
				if(ele==a[mid])
				{
					return mid;
				}else if(ele<a[mid])
				{
					r=mid-1;
				}else {
					l=mid+1;
				}
			}
		return -1;    // means element not found
		
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,5,8,9,15,18,20};
		int ele=15;
		int result=BinarySearch(a,ele);
		if(result==-1)
		{
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element is found at index: "+result);
		}
	}
}

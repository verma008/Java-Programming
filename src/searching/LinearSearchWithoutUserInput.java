/* Linear Search: also known as sequential search. break keyword means the control will go outside from the loop in which break statement is written. 
 Time Complexity 1. best case: O(1) Elelment present at index 0, position1
 worst case: O(n) element present at last index ,n comparision will be there, we need to travse whole array
 average case: Summetion of all possible cases/ number of cases. how many comparition will be n
 If data is present at 0 index so how many comparision will be 1, if data is present at 1 index so here will be 2 comparision.......
 if data is present at (n-1) index nth position so how many comparision will be n.
 so (1+2+3+4+5........n)/n=n(n+1)/2n= n=1/2   */

// Leaner Search 
package searching;

public class LinearSearchWithoutUserInput {
	
	public static void linearSearch(int a[], int ele)
	{
		int n=a.length;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				System.out.print("Element found at index: "+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
	}
	
	public static void main(String[] args) {
		
		int a[]= {22,11,33,2,5,6,72,12};
		int ele=22;
		linearSearch(a,ele);
		
	}

}

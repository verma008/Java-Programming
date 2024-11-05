/*Given Q queries, check if the given number is present in the array or not. Value of all the elements in the array is 
 * less than 10 to the power 5*/

package array;

import java.util.Scanner;

public class PresentQuery {
	
	static int[] frequencyArray(int a[])
	{
		int freq[]=new int[100005];
		for(int i=0;i<a.length;i++) {
			freq[a[i]]=freq[a[i]]+1;
		}
		return freq;
	}
	
	public static void main(String[] args){
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+ n +" elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=r.nextInt();
		}
		
		int freq[]=frequencyArray(a);
		
		System.out.println("Enter number of queries: ");
		int q=r.nextInt();
		
		while(q>0) {
			System.out.println("Enter number to be searched: ");
			int x=r.nextInt();
			if(freq[x]>0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			q--;
		}
	}
}

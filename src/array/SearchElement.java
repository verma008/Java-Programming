package array;
//java program to search an elements in array
import java.util.Scanner;

public class SearchElement {
	
	public static void main(String[] args) {
		
		System.out.print("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter element to be searched: ");
		int ele=r.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==ele)
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.print("Element found "+count+" times");
		}
		else {
			System.out.println("Element not found");
		}
		
		
	}

}

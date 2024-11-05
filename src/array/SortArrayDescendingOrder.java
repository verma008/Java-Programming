package array;

import java.util.Scanner;

public class SortArrayDescendingOrder {
	
	public static void main(String[] args) {
		
		int i,j,n,temp;
		System.out.println("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element of array: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Array in descending order: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

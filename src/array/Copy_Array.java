package array;

import java.util.Scanner;

public class Copy_Array {

 public static void main(String[] args) {
	 
	 int a[]=new int[5];
	 int b[]=new int[5];
	 
	System.out.println("Enter value in first: ");
	Scanner r=new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		a[i]=r.nextInt();
	}
	
	System.out.println("First array elements: ");
	for(int i=0;i<5;i++)
	{
		System.out.print(a[i]+" ");
	}
	
	
	System.out.println("\nSecond array elements: ");
	for(int i=0;i<5;i++)
	{
		b[i]=a[i];
		System.out.print(b[i]+" ");
	}
	
	
}
	
}

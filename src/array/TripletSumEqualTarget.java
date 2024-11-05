package array;

import java.util.Scanner;
public class TripletSumEqualTarget{	
	
	int tripletSum(int a[], int targetSum) {
		
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1; k<n;k++)
				{
					if(a[i]+a[j]+a[k]==targetSum)
					{
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		TripletSumEqualTarget tps=new TripletSumEqualTarget();
		Scanner r=new Scanner(System.in);
		
//		System.out.println("Enter array size: ");
		int n= r.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+ n+ "elements: ");
		for(int i=0;i<n;i++){
			a[i]=r.nextInt();
		}
		
		System.out.println("Enter target sum: ");
		int targetSum=r.nextInt();
		
		
		int sum= tps.tripletSum(a,targetSum);
		System.out.println("Number of pairs available in the array: "+sum);
	}
}

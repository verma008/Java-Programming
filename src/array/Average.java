package array;

/* java program to find average of an array elements.   */
import java.util.Scanner;


public class Average {
	public static void main(String[] args) {
		
		int sum=0;
		double avg;
		System.out.print("Enter size of array: ");
		Scanner r=new Scanner(System.in);
		int n=r.nextInt();
		int a[]=new int[n];
		System.out.print("Enter elements of array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.print("Sum of array: "+sum);
		avg=sum/(float)n;
		System.out.print("\nAverage of array: "+avg);
		
	}

}

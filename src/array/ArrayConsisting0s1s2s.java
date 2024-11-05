package array;

public class ArrayConsisting0s1s2s {
	
public static void main(String[] args) {
	int a[]= {1,2,0,1,1,2,0};
	ArrayConsisting0s1s2s ts=new ArrayConsisting0s1s2s();
	ts.methodPair(a);
	System.out.println("\nSorted array: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}

 void methodPair(int[] a) {
	// Count occurrences of 0s, 1s, and 2s
    int count = 0, count1 = 0, count2 = 0;
	for(int i=0; i<a.length;i++)
	{
		if(a[i]==0)
		{
			count++;	
		}
		else if(a[i]==1)
		{
			count1++;
		} 
		else if(a[i] == 2) {
            count2++;
        }
	}
	
	
	for(int i=0;i<a.length;i++)
	{
		if(i<count)
		{
			a[i]=0;
		}
		else if(i< count + count2)
		{
		    a[i]=2;	
		}
		else {
			a[i]=1;
		}
	}
	
	
  }
}

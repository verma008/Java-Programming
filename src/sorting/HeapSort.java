package sorting;

public class HeapSort {
	
	// Function to perform heap sort
	public static void heapSort(int a[],int n)
	{
		// build max heap
		for(int i=n/2;i>=1;i--)
		{
			maxHeapify(a,n,i);
		}
		
		// delete heap
		for(int i=n;i>=1;i--)
		{
			int temp=a[1];
			a[1]=a[i];
			a[i]=temp;
			maxHeapify(a,i-1,1);
		}
	}
		
		// Function to maintain the max heap property
		
		public static void maxHeapify(int a[],int n, int i)
		{
			int largest=i;
			int l=2*i;
			int r=2*i+1;
			
			if(l<=n && a[l]>a[largest])
			{
				largest=l;
			}
			if(r<=n && a[r]>a[largest])
			{
				largest=r;
			}
			
			if(largest != i)
			{
				int temp=a[largest];
				a[largest]=a[i];
				a[i]=temp;
				maxHeapify(a,n,largest);
			}
	}
	public static void main(String[] args) {
		
		int a[] = {1,3,7,4,15,20,25,3,4,88,98};
		
		// Using 0th index as dummy (unused)
        // Subtracting 1 to account for the dummy 0th index

		int n=a.length-1;
		heapSort(a,n);
		
		System.out.println("Sorted Array:");
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
		
		
	}
}

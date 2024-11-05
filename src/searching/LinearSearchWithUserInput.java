/* Write a program to search an element in array at any specific location/position in Java */
// time complexity = O(n)

package searching;
import java.util.Scanner;
public class LinearSearchWithUserInput{
    public static void main(String[] args){
        int n,i, flag=0,ele;
        System.out.println("Enter the size of array: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(i=0;i<n;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int m:a)   // (arraytype variablename: arrayname)
        {
            System.out.print(m+" ");
        }

        System.out.println("\nEnter the element which you want to search: ");
        ele=r.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element is found at position: "+(i+1));
        }
        else
        {
            System.out.println("Element is not found");
        }
    }
}
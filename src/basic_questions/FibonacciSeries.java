/*Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,starting from 0 and 1
*0, 1, 1, 2, 3, 5, 8, 13, 21, .
* */
package basic_questions;

public class FibonacciSeries{
    public static void main(String[] args) {

        int a=0, b=1, n=10;

        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

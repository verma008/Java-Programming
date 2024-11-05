/*
Stack-----LIFO Concept
push()--push the data ,
pop()--pop the data,
peek()--access the data from top of stack
 */

package collection_framework;

import java.util.Scanner;
import java.util.Stack;

public class StackClass{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

//        s.push(11);
//        s.push(22);
//        s.push(33);
//        s.push(44);
//        s.push(5);
//      System.out.println(s);

//        int d=s.peek();
//        System.out.println(d);


//      s.pop();
//      System.out.println(s);

//        System.out.println(s);
//        int e=s.search(33);
//        System.out.println(e);

        Scanner r=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter your number: ");
            int value=r.nextInt();
            s.push(value);
        }
        System.out.println(s);

if(!s.isEmpty())
{
    s.pop();
}

    }
}






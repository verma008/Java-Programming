package basic_questions;

import java.util.Scanner;

public class FactorialNumber{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int no=r.nextInt();
        int fact=1;
        for(int i=no;i>=1;i--){
             fact=fact*i;
         }
        System.out.println("Factorial of "+no+ " is: "+fact);
    }
}

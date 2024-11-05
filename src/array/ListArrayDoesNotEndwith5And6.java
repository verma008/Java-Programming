//Given an array of integers,return a list of those numbers that when squared and 10 is added to the square then,
//the result does not end with a 5 or 6

package array;

import java.util.ArrayList;
import java.util.List;

public class ListArrayDoesNotEndwith5And6 {
	
	List<Integer> listIntNotEndswith5and6(int[] a) {
		
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			int n= a[i]*a[i]+10;
			if(n%10 != 5 &&  n%10!= 6){
				list.add(n);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		  
		ListArrayDoesNotEndwith5And6 obj=new ListArrayDoesNotEndwith5And6();
		List<Integer> listIntNotEndswith5and6 = obj.listIntNotEndswith5and6(a);
		System.out.println(listIntNotEndswith5and6);	
	}	
}

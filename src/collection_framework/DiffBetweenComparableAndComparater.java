/* Comparable: An Functional Inerface used for default natural sorting order. Present in java.lang package.
               Defines only one method compareTo(). All Wrapper classes and String class implement comparable interface.
 * Comparater: An Interface used for customized sorting order. Presentin java.util pckage.
               Defines Both methods compare() and equals().Classes that implement Comparater interface are : Collator and RuleBasedCollator
 * Sorting   : Both are used for Sorting with Collections.   
 *Collections.sort(nums);  Comparable used for default sorting. 
 *Collections.sort(nums,com);  Comparater used for sorting based on your own logic       */

package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DiffBetweenComparableAndComparater {
	
	public static void main(String[] args) {
		
// Q1 sorting based on last number in interger two digit number
		Comparator<Integer> com=new Comparator<Integer>()
				{
			          public int compare(Integer i, Integer j)
			          {
			        	  if(i%10>j%10)
			        		  return 1;
			        	  else
			        		  return -1;
			          }
				};
		
		List<Integer> nums= new ArrayList<>(); // after 1.7version <Interger> likhne ki jarurat nhi hai
		nums.add(42);
		nums.add(53);
		nums.add(31);
		nums.add(24);
		nums.add(15);
		
		Collections.sort(nums);   
		Collections.sort(nums,com);  
		
		System.out.println(nums);
		

// Q2 Sort string based on their length in ascending order
		
		// jai saraswati ma: Anonymous Inner Class
		Comparator<String> str1=new Comparator<String>()
		{
			     public int compare(String s1,String s2)
			     {
			    	 if(s1.length()>s2.length())
			    		 return 1;
			    	 else 
			    		 return -1;
			    		 
			     }};
				
	    List<String> str=new ArrayList<>();
		str.add("archana");
		str.add("brizma");
		str.add("rubi");
				
		Collections.sort(str,str1);
		System.out.println(str);
				
	}
}

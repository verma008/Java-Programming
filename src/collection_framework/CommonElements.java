/*Write a java method that takes two lists of integers and returns a list containing common elements between two lists.
* The result should contain unique elements only.*/
package collection_framework;

import java.util.*;

public class CommonElements {
    public static List<Integer> commonElements(List<Integer> list1,List<Integer> list2){
        Set<Integer> set1=new HashSet<>(list1);
        Set<Integer> commonElement=new HashSet<Integer>();
        for(Integer num: list2){
            if(set1.contains(num)){
                commonElement.add(num);
            }
        }
        return new ArrayList<>(commonElement);
    }

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(4,1,2,3,4,5);
        List<Integer>  list2=Arrays.asList(2,3,4,6,4,2);

        List<Integer> integers = commonElements(list1, list2);
        System.out.println("common elements between two lists: "+integers);
    }
}

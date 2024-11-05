package collection_framework;

import java.util.*;

public class ReturnUniqueSortedList {

    List<Integer> sortedList(List<Integer> list){
        Set<Integer> uniqueSet=new HashSet<>(list);
        List<Integer> uniqueList=new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList);

        return uniqueList;
    }
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,3,2,3,4,5,5,4,2);
        ReturnUniqueSortedList r=new ReturnUniqueSortedList();
        List<Integer> sortedIntegers = r.sortedList(list);
        System.out.println("Unique sorted list: "+sortedIntegers);
    }
}

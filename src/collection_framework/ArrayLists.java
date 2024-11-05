/* The difference between array and arraylist is :arraylist prints data in the form of list.
   Collection framework includes: 1.Collection Interface 2. Map Interface 3. Iterator
1. Collection Interface:
	List Interface-- ArrayList,Linked List, Stack, Vector,
	Set Interface--HashSet,LinkedHashSet, TreeSet,EnumSet
	Queue---Array Deque, LinkedList,Priority Queue

2  Map Interface
	HashMap,TreeMap,EnumMap,LinkedHashMap,WeakHashMap

3. Iterator----List Iterator  

ArrayList:
add():      add data into arraylist
get():      just like A[2],A[3] fetch data from a particular index
remove(2):  remove data from 2nd index
clear():    delete all the data from arraylist
contains(): if we want to check particular data exist in the arraylist or not
set():      set data from a particular index
 */

package collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class ArrayLists{
	
    public static void main(String[] args) {
 
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();
        
// add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
  
        
// To get an elements  : 1 is the index
        int ele = list.get(1);      
        System.out.println(ele);
        

//add element in between :  1 is the index and 2 is the element to be added
        list.add(1,2);
        System.out.println(list);
   
        
// set elements
        list.set(0, 0);
        System.out.println(list);
     
        
// delete elements        
        list.remove(1);
        System.out.println(list);

        
// size of arraylist
       int n= list.size();
       System.out.println(n);
   
       
// sorting the list
       Collections.sort(list);
       System.out.println(list);
       

// to get element is present in ArrayList or not: return true or false
        boolean e=list.contains(20);  
        System.out.println(e);

        
//print data in the form of array only: Loops on lists
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

// clear list
//      list.clear();
//      System.out.println(list);
      
      
// Iterator Interface--List Iterator Class
        /*1.forward traversing --hasNext(),next()
          2.Backward traversing--hasPrevious(),previous() */
        
        ListIterator it=list.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        } 
    }
}

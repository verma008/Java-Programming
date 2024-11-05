/* HashSet : Unordered set of items. Does not allow duplicates.
1.HashSet--add(),remove(),contains(),size(),clear()
2.LinkedHashSet- 5 method same
3.TreeSet-add(),remove(),contains(),size(),clear()
 //get(),set() function is not allowed in set interface bcoz it is unordered set. */

package collection_framework;

import java.util.HashSet;
import java.util.Iterator;


public class HashSets {
    public static void main(String[] args) {
    
// creation/insertion    	
      HashSet<Integer> set=new HashSet<Integer>();
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        
// print all elements      
        System.out.println(set);
 
// size
        System.out.println("Size of set is: "+set.size());
                
// search-contains
        if(set.contains(1)){
        	System.out.println("Set Contains 1");
        }
        
        if(!set.contains(6)){
        	System.out.println("does not contain 6");
        }
        
// Delete 
       boolean b= set.remove(3);
       System.out.println(b);
       
// Iterator
       Iterator<Integer> it=set.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       
// clear() : //[]     
//        set.clear();
//        System.out.println(set);   
        
//isEmpty()
        if(!set.isEmpty()) {
            System.out.println("set is not empty");
        }

    }
}

package collection_framework;
// print data in same order as we insert
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// use property of LinkedList + Set Ordered collection
public class LinkedHashSets {
    public static void main(String[] args) {
//        Set<Integer> c = new LinkedHashSet<>();
        Set<Integer> c = new TreeSet<>(); // SET +BST (store data in sorted form)

        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);
        c.add(10);
        System.out.println(c);  //[50,100,10,60]

        c.remove(50);
        System.out.println(c);

//        c.clear();
//        System.out.println(c);    //[]

        int d = c.size();
        System.out.println(d);//3

        System.out.println(c.contains(60));  //return true
    }
    }

// LinkedListClass in List Interface( Linkedlist Class is same as in Array List)
package collection_framework;

import java.util.LinkedList;
import java.util.List;
public class LinkedLists {
    public static void main(String[] args) {
        List<Integer> c=new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(20);
        c.add(44);
        System.out.println(c);

        int d=c.get(2);
        System.out.println(d);

        c.remove(2);
        System.out.println(c);

        boolean e=c.contains(44);
        System.out.println(e);

//        c.clear();
//        System.out.println(c);

        c.set(1,9);
        System.out.println(c);



    }
}

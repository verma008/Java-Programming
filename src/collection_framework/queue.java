/*
Queue Interface
1.Linked List--offer()-enqueue the data, poll()--dequeue the data, peek()--find out the first element of the queue
2.Priority Queue---offer(), poll()
 */
// Implementation of queue using linked list class

package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
    	
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q); //[10, 20, 30, 40, 50]

        System.out.println(q.peek()); // 10

        q.poll();
        q.poll();
        System.out.println(q);  // [30 40 50] delete the data from the front only


    }
}

package collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue{
    public static void main(String[] args) {
//        Queue<Integer> q=new PriorityQueue<>();  // PQ implements Min Heap by Default
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder()); // MAX HEAP

        q.offer(10);
        q.offer(33);
        q.offer(20);
        q.offer(90);
        q.offer(89);
        System.out.println(q);

        q.poll();
        System.out.println(q);
    }
}

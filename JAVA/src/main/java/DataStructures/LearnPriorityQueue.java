package DataStructures;

import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        //It doesn't permit null
        // It provides O(log k) time for add and poll methods
        PriorityQueue pq = new PriorityQueue(); // default intial capacity of 11
        // Default ordering is Ascending and is known as minheap ... element at top is always smallest
        //Collections.reverseOrder() will create a max heap.
        //PriorityQueue pq1 = new PriorityQueue((a,b)->b-a); //pass comparator for custom ordering

        PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
        pqueue.add(4);
        pqueue.add(3);
        pqueue.add(5); //Inserts the element into priority queue. Order is not retained. Throws exception if queue is full
        pqueue.offer(7); // Inserts the specific element into queue. Doesn't throw and exception if the queue is full and return false
        pqueue.peek(); //retrieves but not removes the head of this queue
        System.out.println(pqueue.poll()); // retrieves and removes the head of this queue or returns null if queue is empty
        pqueue.size(); //returns size of the queue
        pqueue.contains(4); // returns true / false
        pqueue.isEmpty(); // returns true / false
        pqueue.clear();
        pqueue.toArray(); //array containing all elements in the queue

        //Iteration
        //Using iterator
        Iterator itr = pqueue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

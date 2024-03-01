package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        //THis can be implemented by arraylist or linkedlist
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12); //add elements in queue
        //Another alternative is add() but it crashes the app if operation is not done

        queue.offer(23);
        queue.offer(45);
        System.out.println(queue);

        System.out.println(queue.poll()); // remove element from queue. First element will be removed
        //Can use remove() but crashes if the queue is empty

        System.out.println(queue.peek()); //Next element in queue
        //Can use element() but it crashes if not found
    }
}

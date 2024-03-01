package DataStructures;

import java.util.ArrayDeque;

public class LearnDeQueue {
    public static void main(String[] args) {
        //Arraydequeu
        //Add or remove from front or back
        //can be used in sliding window concept
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); //from queue
        adq.offerFirst(12); //from ArrayDequeue
        adq.offerLast(45); //from ArrayDequeue
        System.out.println(adq);

        System.out.println(adq.poll());
        System.out.println(adq.pollLast());
    }
}

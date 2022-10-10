package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWorking {

    public static void main(String[] args) {


        Queue<Integer> numbers = new PriorityQueue<>();


        numbers.offer(3);
        numbers.offer(2);
        numbers.offer(4);
        numbers.offer(1);

        System.out.println("Queue is " + numbers);

        //Accessing the element of the Queue

        int accessedNumber = numbers.peek();

        System.out.println("accessed Element " + accessedNumber);


        // Remove an element from the Queueu
        int removedNumber = numbers.poll();
        System.out.println("Removed Element " + removedNumber);

        System.out.println("Updated Queue is " + numbers);
    }
}

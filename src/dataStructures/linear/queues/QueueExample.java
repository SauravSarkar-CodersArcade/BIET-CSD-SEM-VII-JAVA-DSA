package dataStructures.linear.queues;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // offer()-> push() poll()->pop()
        queue.offer(10); // No problem if the max size if reached
        queue.offer(11);
        queue.offer(1);
        System.out.println(queue);
        queue.add(20); // Throws an Exception if the max size is reached
        System.out.println(queue);
        System.out.println(queue.poll()); // Not strict
        System.out.println(queue.remove()); // Very strict
    }
}

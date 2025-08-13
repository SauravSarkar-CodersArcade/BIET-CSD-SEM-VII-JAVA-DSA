package dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeapExample {
    public static void main(String[] args) {
        // In Java, Priority Queue is a min heap by default
        // To convert to a maxHeap we use reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(15);
        maxHeap.add(3);
        maxHeap.add(1);
        System.out.println(maxHeap);
        System.out.println("Largest element: " + maxHeap.poll());
    }
}

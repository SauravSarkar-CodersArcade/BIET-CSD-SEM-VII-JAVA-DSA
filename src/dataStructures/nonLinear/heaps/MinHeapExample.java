package dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
public class MinHeapExample {
    public static void main(String[] args) {
        // In Java, Priority Queue is a min heap by default
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(3);
        minHeap.add(1);
        System.out.println(minHeap);
        System.out.println("Smallest element: " + minHeap.poll());
    }
}

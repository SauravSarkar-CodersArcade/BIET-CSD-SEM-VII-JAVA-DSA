package dataStructures.nonLinear.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElementInArray {
    public static void kthSmallestElementInArray(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>
                (Collections.reverseOrder());
        for (int x : arr){
            maxHeap.add(x);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        // The element at the root node after removing k+1 elements is the
        // kth smallest element
        System.out.println("The " + k + "th smallest element is: " + maxHeap.peek());
    }
    public static void main(String[] args) {
        int[] arr = {7,4,3,10,20,8};
        int k = 3;
        kthSmallestElementInArray(arr,k);
    }
}

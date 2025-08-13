package dataStructures.nonLinear.heaps;
import java.util.PriorityQueue;
public class KLargestElementsInArray {
    public static void kLargestInArray(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Insert all elements of the array into the min heap
        // Check the size and remove the smallest elements till the sie is greater then k
        for (int x : arr){
            minHeap.add(x);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        // Print the remaining elements of the min heap - They will be the k-largest elements
        System.out.println("The " + k + " largest elements are: ");
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,2,0,3,1,8,7};
        int k = 3;
        kLargestInArray(arr,k);
    }
}

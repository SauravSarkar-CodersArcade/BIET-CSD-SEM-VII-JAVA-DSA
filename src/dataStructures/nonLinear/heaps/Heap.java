package dataStructures.nonLinear.heaps;
public class Heap {
    private int[] arr;
    private int size;
    public Heap(){
        arr = new int[101]; // 100 size with 0-th index having a sentinel value
        arr[0] = -1;
        size = 0; // Initially the heap is empty
    }
    public void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void print(){
        for (int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void insert(int val){
        size++;
        arr[size] = val;
        int index = size;
        int parent = index / 2;
        while (index > 1){
            if(arr[index] > arr[parent]){
                swap(index, parent);
                index = parent;
            }else {
                return; // The element that we inserted is at correct position
            }
        }
    }
    public void deleteFromHeap(){
        if (size == 0){
            System.out.println("Heap is empty. Can't delete the root node.");
            return;
        }
        // Move the last element to the root node
        arr[1] = arr[size];
        // Decrement the size to remove the duplicate value
        size--;
        int i = 1; // Problem index
        while (i < size){
            int leftIndex = 2 * i;
            int rightIndex = 2 * i + 1;
            if(i <= size && arr[i] < arr[leftIndex]){
                swap(i, leftIndex);
                i = leftIndex;
            }else if(i <= size && arr[i] < arr[rightIndex]){
                swap(i, rightIndex);
                i = rightIndex;
            }else {
                return; // The element has reached its correct position
            }
        }
    }
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i;
        int right = 2*i + 1;
        if(left <= n && arr[largest] < arr[left]){
            largest = left;
        }
        if(right <= n && arr[largest] < arr[right]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            // Recursion for the remaining nodes or elements
            heapify(arr, n, largest);
        }
    }
    public static void heapSort(int[] arr, int n){
        int size = n;
        while (size > 1){
            // Swap the first & last elements
            int temp = arr[1];
            arr[1] = arr[size];
            arr[size] = temp;
            size--; // Decrement the size because the last element is sorted
            // Propagate the root value (index 1) to it's correct position - heapify
            heapify(arr, size, 1);
        }
    }
    public static void main(String[] args) {
        Heap maxHeap = new Heap();
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(50);
        maxHeap.insert(10);
        maxHeap.insert(40);
        maxHeap.print();
        maxHeap.deleteFromHeap();
        maxHeap.print();
        int[] arr = {-1, 54, 53, 55, 52, 50};
        int n = 5;
        for (int i=n/2; i>0; i-- ){ // We only consider the non-leaf nodes
            heapify(arr, n, i);
        }
        System.out.print("Array after heapify: ");
        for (int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        heapSort(arr, n);
        System.out.print("Array after heap sort O(n log n): ");
        for (int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

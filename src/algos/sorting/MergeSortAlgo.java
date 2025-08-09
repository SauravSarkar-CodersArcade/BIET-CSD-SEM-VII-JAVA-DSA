package algos.sorting;
import java.util.Arrays;
public class MergeSortAlgo {
    public static void mergeSort(int[] arr){
        if(arr.length < 2){
            return; // Single element need not be sorted
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        // Recursively split the left had side
        mergeSort(left);
        // Recursively split the right had side
        mergeSort(right);
        merge(arr, left, right); // Merge the left & right arrays
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }
        // If there are extra elements, copy & paste
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
//        int[] arr = {8,1,4,2,0,6,3};
        int[] arr = {10,4,1,2,6,3,0,-3,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

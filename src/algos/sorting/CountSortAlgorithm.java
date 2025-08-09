package algos.sorting;

import java.util.Arrays;

public class CountSortAlgorithm {
    public static void countSort(int[] arr){
        // Find the max
        int k = arr[0]; // Let's assume that the first element is the max
        for(int i=1; i< arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Create the count array of 0 to max (k)
        int[] count = new int[k+1]; // k including 0 (k+1)
        // Calculate the frequency of all elements in the array
        for (int i=0; i< arr.length; i++){
             count[arr[i]]++;
        }
        // Calculate the cumulative count (curr = curr + prev)
        // We calculate from 1 till max
        for (int i=1; i<=k; i++){
            count[i] += count[i-1];
        }
        // Create the output array
        int[] output = new int[arr.length];
        // Start from the end of the array
        for (int i= arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // copy the output back to the input
//        for (int i=0; i< arr.length; i++){
//            arr[i] = output[i];
//        }
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,1,4,3,2,3,1};
        System.out.println("Before: ");
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));
    }
}

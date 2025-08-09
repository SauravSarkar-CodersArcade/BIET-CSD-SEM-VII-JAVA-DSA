package algos.searching;
public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key, int s, int e){
        // Edge / Base / Corner Case
        if ( s > e){
            return -1; // Invalid Case
        }
        int mid = s + (e-s)/2; // Big O (log n)
        if(arr[mid] == key){
            return mid;
        }else if (arr[mid] < key){
            return recursiveBinarySearch(arr, key, mid+1, e); // Start changes
        }else {
            return recursiveBinarySearch(arr,key, s, mid-1); // End changes
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,9,12};
        System.out.println(recursiveBinarySearch(arr,2, 0, arr.length-1));
    }
}

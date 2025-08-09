package algos.searching;
public class BinarySearch {
    public static int binarySearch(int[] arr, int key){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s) / 2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                s = mid + 1; // Go to the right to find the key
            }else {
                e = mid - 1; // Go to the left to find the key
            }
        }
        return -1; // Return an invalid index saying we didn't find the key in the array
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,9,12};
        System.out.println(binarySearch(arr,900));
    }
}

package algos.arrays;
public class TwoUniqueElements {
    public static void findTwoUniques(int[] arr){
        int xorAll = 0;
        int n1 = 0, n2 = 0;
        for (int i=0; i<arr.length; i++){
            xorAll ^= arr[i];
        }
        int rsb = xorAll & -xorAll;
        for(int i=0; i<arr.length; i++){
            if((arr[i] & rsb) == 1){
                n1 ^= arr[i];
            }else {
                n2 ^= arr[i];
            }
        }
        System.out.println("The two unique elements are: " + n1 + ", " + n2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,2,1};
        findTwoUniques(arr);
    }
}

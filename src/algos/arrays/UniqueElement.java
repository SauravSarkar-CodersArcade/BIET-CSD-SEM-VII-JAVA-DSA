package algos.arrays;
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,1,2,3};
        int unique = 0;
        for (int i=0; i< arr.length; i++){
            unique ^= arr[i];
        }
        System.out.println("The unique element is: " + unique);
    }
}

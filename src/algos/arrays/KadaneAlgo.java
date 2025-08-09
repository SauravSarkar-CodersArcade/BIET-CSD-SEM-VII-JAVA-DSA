package algos.arrays;
public class KadaneAlgo {
    public static int Kadane(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for (int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax + arr[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        System.out.println(Kadane(arr));
        int[] arr1 = {-1,-2,-3,0,-5,-7};
        System.out.println(Kadane(arr1));
    }
}

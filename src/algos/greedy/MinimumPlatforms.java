package algos.greedy;
import java.util.Arrays;
import java.util.Map;

public class MinimumPlatforms {
    public static int minPlatforms(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int platformNeeded = 0, maxPlatforms = 0;
        int i=0, j=0;
        while (i < n && j < n){
            if(arr[i] <= dep[j]){ // To avoid overlapping
                platformNeeded++;
                i++;
            }else {
                platformNeeded--;
                j++;
            }
            maxPlatforms = Math.max(platformNeeded, maxPlatforms);
        }
        return maxPlatforms;
    }
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int result = minPlatforms(arr, dep);
        System.out.println("Minimum Platforms: " + result);
    }
}

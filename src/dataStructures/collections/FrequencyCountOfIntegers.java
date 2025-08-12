package dataStructures.collections;
import java.util.HashMap;
public class FrequencyCountOfIntegers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,6,7};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        System.out.println(freq);
    }
}

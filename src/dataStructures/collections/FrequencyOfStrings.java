package dataStructures.collections;
import java.util.HashMap;
public class FrequencyOfStrings {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "Java", "C++", "Python", "Java", "Python", "SQL"};
        HashMap<String, Integer> freq = new HashMap<>();
        for (String language : arr){
            freq.put(language, freq.getOrDefault(language, 0) + 1);
        }
        System.out.println(freq);
    }
}

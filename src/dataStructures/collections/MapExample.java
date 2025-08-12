package dataStructures.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapExample {
    // <K,V> pair in Map is called Entry
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("03", "Python");
        map.put("02", "SQL");
        map.put("01", "Java");
        map.put("05", "JavaScript");
        map.put("04","C++");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // How to maintain the insertion order in a HashMap ?
        // To maintain insertion order, we use a LinkedHashMap
        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("03", "Python");
        map1.put("02", "SQL");
        map1.put("01", "Java");
        map1.put("05", "JavaScript");
        map1.put("04","C++");
        for (Map.Entry<String, String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

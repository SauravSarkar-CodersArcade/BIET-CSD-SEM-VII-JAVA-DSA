package dataStructures.collections;
import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Ranjan");
        ht.put(117, "Divya");
        ht.put(128, "Ganesh");
        ht.put(102, "Mamatha");
        ht.put(100, "Sharada");
        ht.put(99, "Avinash");
        for (Map.Entry<Integer, String > entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

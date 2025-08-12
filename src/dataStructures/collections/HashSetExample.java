package dataStructures.collections;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(10);
        hashSet.add(12);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(11);
        System.out.println(hashSet);
    }
}

package dataStructures.collections;
import java.util.ArrayList;
import java.util.Collections;
// Pascal Naming Convention
public class CollectionsClassExample {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(1);
        integers.add(2);
        integers.add(0);
        integers.add(4);
        System.out.println("Before: " + integers);
        Collections.sort(integers);
        System.out.println("After Sorting: " + integers);
        Collections.reverse(integers);
        System.out.println("Reverse: " + integers);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
        list.addAll(integers); // The second list will be added at the end of the first list
        System.out.println(list);
    }
}

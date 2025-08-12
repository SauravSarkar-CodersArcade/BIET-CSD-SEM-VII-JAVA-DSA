package dataStructures.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        System.out.println(integers);
        List<String> strings = new LinkedList<>();
        strings.add("Java");
        strings.add("Python");
        System.out.println(strings);
        List<Object> anonymous = new LinkedList();
        anonymous.add("String");
        anonymous.add(1);
        anonymous.add(1.2);
        System.out.println(anonymous);

    }
}

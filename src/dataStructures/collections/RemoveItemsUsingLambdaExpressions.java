package dataStructures.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveItemsUsingLambdaExpressions {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(1);
        integers.add(2);
        integers.add(0);
        integers.add(4);
        integers.add(11);
        integers.add(21);
        System.out.println("Before: " + integers);
        integers.removeIf(n -> n > 10);  // One Liner
        // n - Predicate, -> - Lambda Expression, n > 10 - Filter
        System.out.println("After " + integers);
    }
}

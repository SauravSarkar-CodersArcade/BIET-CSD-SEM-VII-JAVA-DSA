package dataStructures.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveItemsUsingIterator {
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
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if(i > 10){
                it.remove();
            }
        }
        System.out.println("After " + integers);
    }
}

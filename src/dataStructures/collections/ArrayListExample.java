package dataStructures.collections;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Avocado");
        fruits.add("Pineapple");
        fruits.add("Guava");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.contains("Watermelon"));
        fruits.remove("Mango");
        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);
    }
}

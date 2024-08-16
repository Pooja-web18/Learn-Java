package collectionAndLists;
import java.util.*;

public class HMClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "One");
        hmap.put(2, "Two");
        hmap.put(3, "Three");
        hmap.put(4, "Four");

        System.out.println("hashmap content is :" + hmap);
        System.out.println("Value of key = 3 is : " + hmap.get(3));

        hmap.replace(3, "Eleven");
        System.out.println("Value of key = 3 is : " + hmap.get(3));

        hmap.remove(3);
        System.out.println("hashmap content is : " + hmap);


    }
}

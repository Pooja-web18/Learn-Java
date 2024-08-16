package collectionAndLists;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
       map.put(1, "One");
        map.put(2, "two");
        map.put(3, "Three");
        map.put(4, "Four");
//        if we want to update the value
        map.put(2, "four");
//        If we dont want to update the value
        map.putIfAbsent(2, "four");


        System.out.println("map content : " + map);
        System.out.println("key = 3 is having value : " + map.get(3));
        System.out.println("All keys " + map.keySet());
        System.out.println("All values " + map.values());



    }
}

package collectionAndLists;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class LearnList {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(10);
        list.add(20);
//        list.add(30);
        list.add(1);

        list.add(1);
        list.add(2);
        list.add(3);

//        System.out.println(list);
//        System.out.println(list.size());
//
//        System.out.println(list.contains(40));
//
//        list.remove(1);
//       System.out.println(list);
//
//        list.remove(Integer.valueOf(1));
//        System.out.println(list);

//        list.addAll(list2);
//        list.removeAll(list2);
//        list.retainAll(list2);
//        list.clear();

        Object a[] = list.toArray();

//        for(Object e: a){
//            Integer temp =(Integer) e;
//            System.out.println(e);
//        }
       System.out.println(list);

    }
}

package collectionAndLists;

import java.util.*;

public class HashLinked {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);

        lhs.add(3);
        lhs.add(6);

        lhs.remove(4);

        System.out.println("lhs content is : " + lhs);
        Iterator<Integer> it = lhs.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ,");
        }



    }
}

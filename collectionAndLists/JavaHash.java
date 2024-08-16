package collectionAndLists;

import java.util.HashSet;
import java.util.Iterator;

public class JavaHash {
    public static void main(String[] args) {
        HashSet<Integer> Hs = new HashSet<>();
        Hs.add(1);
        Hs.add(2);
        Hs.add(3);
//        Hs.add(4);
//        Hs.add(2);

//        System.out.println("Set size is : " + Hs.size());
//        System.out.print("Set content is : ");
//        Hs.remove(3);

        HashSet<Integer> Hs1 = new HashSet<>();
        Hs1.add(1);
        Hs1.add(4);
        Hs1.add(5);

//        Hs.addAll(Hs1);
//        Hs.retainAll(Hs1);
        Hs.removeAll(Hs1);

        Iterator<Integer> it = Hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + ",");
        }


    }

}
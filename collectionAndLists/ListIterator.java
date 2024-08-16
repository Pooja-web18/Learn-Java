package collectionAndLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListIterator {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Graps");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits is " + fruits.get(i));
        }
        for (String fruit : fruits) {
            System.out.println("for each fruit " + fruit);
        }

        Iterator<String> fs = fruits.iterator();
        while(fs.hasNext()){
            System.out.println("Iterator " + fs.next());
        }

        List<String> smallList = fruits.subList(1,3);
        System.out.println(smallList);

    }
}

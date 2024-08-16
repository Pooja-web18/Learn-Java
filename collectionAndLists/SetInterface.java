package collectionAndLists;
import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> animal = new HashSet<>();
        animal.add("Dog");
        animal.add("Tiger");
        animal.add("Cat");
        animal.add("Lion");

//        System.out.println("Set content is : " + animal);

        System.out.println("size of set: " + animal);

//        animal.remove("Cat");

//        animal.clear();

        animal.remove("Lion");
        System.out.println("size of set: " + animal.size());

//        Using Iterator method
         Iterator<String> it = animal.iterator();
         while(it.hasNext()){
             System.out.print(it.next() + " , ") ;
         }


    }
}

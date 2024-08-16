package collectionAndLists;

  import java.util.ArrayList;
  import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf(30));

//        list.set(2, 200);
        // list.add(2, 1000);
//        list.remove(1);
//        list.remove(Integer.valueOf(20));
//        System.out.println(list);
    }
}

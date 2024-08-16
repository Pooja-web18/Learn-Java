package collectionAndLists;

import java.util.*;

public class Enum {
    public static void main(String[] args) {

//        EnumSet<Size> eset = EnumSet.allOf(Size.class);
//        EnumSet<Size> eset = EnumSet.noneOf(Size.class);
//        EnumSet<Size> eset = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        EnumSet<Size> eset = EnumSet.of(Size.SMALL, Size.LARGE);
         eset.add(Size.MEDIUM);
         eset.remove(Size.SMALL);
//         System.out.println("enum set content : "+ eset);

        Iterator<Size> it = eset.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ,");
        }
    }
}

enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

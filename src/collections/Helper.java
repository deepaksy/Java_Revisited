package collections;

import java.util.Iterator;
import java.util.List;

public class Helper {
    public static <T> void printList(List<T> t){
        for (T value : t) {
            System.out.println(value);
        }
    }
}

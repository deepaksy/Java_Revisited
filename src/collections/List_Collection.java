package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Collection {
    public static List<Integer> numbers;
    public static Iterator<Integer> itr;
    public static void main(String[] args) {
        numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        itr = numbers.iterator();
        printList();

    }

    public static void printList(){
        while(itr.hasNext()){
            System.out.println("value: "+itr.next());
        }
    }
}

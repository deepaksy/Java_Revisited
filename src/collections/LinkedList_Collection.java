package collections;

import java.util.LinkedList;
import java.util.List;

import static collections.Helper.printList;

public class LinkedList_Collection {
    static List<Integer> numbers;
    public static void main(String[] args) {
        numbers = new LinkedList<>();
        fill(numbers);
        printList(numbers);
    }

    public static void fill(List<Integer> t){
        for(int i=0;i<=10;i++){
            t.add(i);
        }
    }
}

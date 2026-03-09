package JAVA.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// Since List is an interface we need to implement it using LinkedList , Queue , Stack , Vector
public class PracticingList {
    public static void main(String[] args) {

//        int a[] = new int[5]; // size is predefined

        List<Integer> list = new ArrayList<>(); // list is not an object and dynamic in size
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new LinkedList<>(); // all operations will be same

        list.add(1); // add method came from collections interface
        list.add(20);
        list.add(30);

        System.out.println(list.get(0)); // 1
        System.out.println(list.set(1 , 200)); // 20 -> 200
        list.add(2 , 1000); // [1,20,1000,30] O(n)
        list.remove(Integer.valueOf(1));
        System.out.println(list.indexOf(1)); // 0
        System.out.println(list.indexOf(10000)); // -1
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20)); // true

        list.remove(1); // removes 20 index is 1 here
        list.remove(Integer.valueOf(30)); // removes 30 no index here

        // METHODS
        list.addAll(list2); //[1,20,30,1,2,3]
        list.removeAll(list2); // removes intersection elements
        list.retainAll(list2);

        list.clear(); // []

        Object a[] = list.toArray(); // list->array
        for(Object e: a){
            Integer temp = (Integer) e;
            System.out.println(e);
        }
        System.out.println(list);
    }
}

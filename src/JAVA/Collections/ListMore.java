package JAVA.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for(int i  = 0 ; i < fruits.size() ; i++){
            System.out.println("fruits are: " + fruits.get(i));
        }

        for(String fruit : fruits){
            System.out.println("for each fruit: " + fruit );
        }

        Iterator<String> fr = fruits.iterator(); // collections
        while(fr.hasNext()){
            System.out.println("iterator: " + fr.next());
        }

        // list itteractor
        Iterator<String> fr = fruits.listIterator();
        while(fr.hasNext()){
            System.out.println("iterator: " + fr.next());
        }

        List<String> smallList = fruits.subList(1,3); // Papaya since 1 is inclusive and 3 is exclusive
        System.out.println(smallList);


    }
}

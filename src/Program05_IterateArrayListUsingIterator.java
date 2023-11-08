/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Program05_IterateArrayListUsingIterator {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");
        arrayList.add("Element 5");

        // Get an Iterator to iterate through the ArrayList
        Iterator<String> iterator = arrayList.iterator();

        // Iterate through the ArrayList using the Iterator
        System.out.println("Iterating through ArrayList using Iterator: ");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}

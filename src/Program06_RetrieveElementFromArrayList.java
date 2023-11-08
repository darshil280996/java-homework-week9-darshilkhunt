/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */

import java.util.ArrayList;

public class Program06_RetrieveElementFromArrayList {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");
        arrayList.add("Element 4");
        arrayList.add("Element 5");

        // Specify the index of the element to retrieve
        int indexToRetrieve = 2;

        // Check if the index is valid
        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            // Retrieve element at the specified index
            String element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid index. Index should be within range [0, " + (arrayList.size() - 1) + " ]");
        }
    }
}

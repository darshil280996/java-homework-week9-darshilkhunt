/*
Write a Java program to test if an array list is empty or not
 */

import java.util.ArrayList;

public class Program07_TestArrayListIsEmpty {

    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Check if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add an element to the ArrayList
        arrayList.add("Element 1");

        // Check if the ArrayList is empty again
        if (arrayList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}

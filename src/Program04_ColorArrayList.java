/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop
 */

import java.util.ArrayList;

public class Program04_ColorArrayList {

    public static void main(String[] args) {
        // Create a new ArrayList to store colors (strings)
        ArrayList<String> colorList = new ArrayList<>();

        // Add some colors to ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        //Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList: ");

        for (String color : colorList) {
            System.out.println(color);
        }
    }
}

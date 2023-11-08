/*
Declare following two arrylist and compare it.
ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink")
 */

import java.util.ArrayList;

public class Program11_CompareArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists c1 and c2
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the two ArrayLists and find the differences
        ArrayList<String> commonElements = new ArrayList<>(c1);
        commonElements.retainAll(c2); // Intersection
        ArrayList<String> uniqueToC1 = new ArrayList<>(c1);
        uniqueToC1.removeAll(c2); // Elements only in c1
        ArrayList<String> uniqueToC2 = new ArrayList<>(c2);
        uniqueToC2.removeAll(c1); // Elements only in c2;

        // Display the results
        System.out.println("Common elements: " + commonElements);
        System.out.println("Elements unique to c1: " + uniqueToC1);
        System.out.println("Elements unique to c2: " + uniqueToC2);
    }
}

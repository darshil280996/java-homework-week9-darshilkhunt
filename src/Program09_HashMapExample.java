/*
 Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Program09_HashMapExample {

    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        Map<String, Integer> people = new HashMap<>();

        // Add some key-value pairs to the HashMap
        people.put("Alice", 25);
        people.put("Bob", 30);
        people.put("Charlie", 28);
        people.put("David", 35);

        // Use a for-each loop to iterate through the values in the map
        System.out.println("Values in the HashMap:");
        for (int age : people.values()) {
            System.out.println(age);
        }
    }
}

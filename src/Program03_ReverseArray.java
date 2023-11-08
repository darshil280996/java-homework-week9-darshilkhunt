/*
Write a Java program to reverse an array of integer values.
 */

public class Program03_ReverseArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Display the original array
        System.out.println("Original Array: ");
        for (int value : originalArray) {
            System.out.println(value + " ");
        }

        System.out.println();

        // Reverse the array
        reverseArray(originalArray);

        // Display the reversed array
        System.out.println("Reversed Array: ");
        for (int value : originalArray) {
            System.out.println(value + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //Move the start index forward and the end index backward
            start++;
            end--;
        }
    }

}

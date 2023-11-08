/*
 **
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 * Writing using if else and while loop
 */

import java.util.Scanner;

public class Program02_StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("_____________________________");
        System.out.println("|                           |");
        System.out.println("|      Mark Sheet           |");
        System.out.println("|___________________________|");

        // Input student details
        System.out.print("| Name: ");
        String name = scanner.nextLine();
        System.out.print("| Roll No: ");
        int rollNo = scanner.nextInt();

        // Input marks for three subjects
        int math, science, english;
        while (true) {
            System.out.print("|___________________________|\n");
            System.out.println("| Subjects : Marks         |");
            System.out.print("|___________________________|\n");
            System.out.print("| Math : ");
            math = scanner.nextInt();
            System.out.print("| Science : ");
            science = scanner.nextInt();
            System.out.print("| English : ");
            english = scanner.nextInt();

            if (isValidMarks(math) && isValidMarks(science) && isValidMarks(english)) {
                break; // Exit the loop if all marks are valid
            } else {
                System.out.println("Invalid Input. Marks should be between 0 to 100.");
            }
        }

        // Calculate total and percentage
        int totalMarks = math + science + english;
        double percentage = (totalMarks / 3.0);

        // Determine result and grade
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }

        // Print the mark sheet
        System.out.println("|___________________________|");
        System.out.println("| Total : " + totalMarks + "          |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage + "  |");
        System.out.println("| Result : " + result + "       |");
        System.out.println("| Grade : " + grade + "        |");
        System.out.println("|___________________________|");

        scanner.close();
    }

    // Helper method to check if marks are within the valid range (0-100)
    private static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }
}

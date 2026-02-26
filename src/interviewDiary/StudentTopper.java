package interviewDiary;
import java.util.Scanner;

public class StudentTopper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int count = scanner.nextInt();

        String[] names = new String[count];
        int[] marks = new int[count];

        int highestIndex = 0;
        int totalMarks = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("\nEnter name for student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter marks for " + names[i] + ": ");
            marks[i] = scanner.nextInt();

            totalMarks += marks[i];

            if (marks[i] > marks[highestIndex]) {
                highestIndex = i;
            }
        }

        double average = (double) totalMarks / count;

        // Grade calculation for topper
        char grade;
        int topperMarks = marks[highestIndex];

        if (topperMarks >= 90)
            grade = 'A';
        else if (topperMarks >= 75)
            grade = 'B';
        else if (topperMarks >= 60)
            grade = 'C';
        else
            grade = 'D';

        System.out.println("\n--- Results ---");
        System.out.println("Topper Name: " + names[highestIndex]);
        System.out.println("Topper Marks: " + topperMarks);
        System.out.println("Topper Grade: " + grade);
        System.out.println("Class Average: " + average);

        scanner.close();
    }
}

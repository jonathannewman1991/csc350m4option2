import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        // create a scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
        float sum = 0; // to hold the sum of all grades
        float max = Float.MIN_VALUE; // start with the smallest possible float value
        float min = Float.MAX_VALUE; // start with the largest possible float value

        // ask the user to enter 10 grades
        System.out.println("Please enter 10 grades:");

        // loop to read each grade
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            float grade = scanner.nextFloat(); // read the grade

            sum += grade; // add grade to sum
            if (grade > max) {
                max = grade; // update max if current grade is larger
            }
            if (grade < min) {
                min = grade; // update min if current grade is smaller
            }
        }

        float average = sum / 10; // calculate average grade
        // print the calculated statistics
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

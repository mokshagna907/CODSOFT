import java.util.Scanner;

public class StudentGradeCalculator {

    public static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=================================");
        System.out.println("   STUDENT GRADE CALCULATOR");
        System.out.println("=================================");

        int numberOfSubjects;

        while (true) {
            System.out.print("Enter Number of Subjects: ");

            if (sc.hasNextInt()) {
                numberOfSubjects = sc.nextInt();

                if (numberOfSubjects > 0)
                    break;
            } else {
                sc.next();
            }

            System.out.println("Invalid Input! Try Again.");
        }

        int totalMarks = 0;

        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {

            while (true) {

                System.out.print("Enter Marks of Subject " + (i + 1) + " (0-100): ");

                if (sc.hasNextInt()) {

                    marks[i] = sc.nextInt();

                    if (marks[i] >= 0 && marks[i] <= 100) {
                        totalMarks += marks[i];
                        break;
                    }

                } else {
                    sc.next();
                }

                System.out.println("Invalid Marks! Please Enter Between 0 and 100.");

            }

        }

        double average = (double) totalMarks / numberOfSubjects;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n=================================");
        System.out.println("           RESULT");
        System.out.println("=================================");

        System.out.println("Total Marks       : " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade             : " + grade);

        if (grade.equals("A+") || grade.equals("A")) {
            System.out.println("Performance       : Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Performance       : Very Good");
        } else if (grade.equals("C")) {
            System.out.println("Performance       : Good");
        } else if (grade.equals("D")) {
            System.out.println("Performance       : Needs Improvement");
        } else {
            System.out.println("Performance       : Failed");
        }

        System.out.println("=================================");

        System.out.println("\nPress Enter to Return to Main Menu...");
        try {
            System.in.read();
            System.in.read();
        } catch (Exception e) {
        }

    }

}

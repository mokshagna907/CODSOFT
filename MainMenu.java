import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========================================");
            System.out.println("      CODSOFT JAVA DEVELOPMENT");
            System.out.println("========================================");
            System.out.println("1. Number Game");
            System.out.println("2. Student Grade Calculator");
            System.out.println("3. ATM Interface");
            System.out.println("4. Currency Converter");
            System.out.println("5. Student Management System");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    NumberGame.startGame();
                    break;

                case 2:
                    StudentGradeCalculator.start();
                    break;

                case 3:
                    ATMInterface.start();
                    break;

                case 4:
                    CurrencyConverter.start();
                    break;

                case 5:
                    StudentManagementSystem.start();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");

            }

        }

    }

}

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    static final int MIN = 1;
    static final int MAX = 100;
    static final int MAX_ATTEMPTS = 7;

    public static void startGame() {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int totalRounds = 0;
        int roundsWon = 0;
        int score = 0;

        char playAgain;

        System.out.println("\n=================================");
        System.out.println("        NUMBER GAME");
        System.out.println("=================================");

        do {

            totalRounds++;

            int number = random.nextInt(MAX - MIN + 1) + MIN;

            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nGuess a number between " + MIN + " and " + MAX);

            while (attempts < MAX_ATTEMPTS) {

                System.out.print("Attempt " + (attempts + 1) + "/" + MAX_ATTEMPTS + ": ");

                while (!sc.hasNextInt()) {
                    System.out.print("Enter a valid number: ");
                    sc.next();
                }

                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {

                    guessed = true;

                    roundsWon++;

                    int roundScore = (MAX_ATTEMPTS - attempts + 1) * 10;

                    score += roundScore;

                    System.out.println("\nCorrect Guess!");

                    System.out.println("Attempts : " + attempts);

                    System.out.println("Round Score : " + roundScore);

                    break;

                } else if (guess < number) {

                    System.out.println("Too Low!");

                } else {

                    System.out.println("Too High!");

                }

            }

            if (!guessed) {

                System.out.println("\nGame Over!");

                System.out.println("Correct Number : " + number);

            }

            System.out.println("\n------------- SCORE BOARD -------------");

            System.out.println("Rounds Played : " + totalRounds);

            System.out.println("Rounds Won    : " + roundsWon);

            System.out.println("Total Score   : " + score);

            System.out.println("---------------------------------------");

            System.out.print("\nPlay Again? (Y/N): ");

            playAgain = sc.next().toUpperCase().charAt(0);

        } while (playAgain == 'Y');

        System.out.println("\nThanks for Playing!");

    }

}

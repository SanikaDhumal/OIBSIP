import java.util.Scanner;

public class numberGuessingGame {
    public static void numberGuessing() {
        Scanner sc = new Scanner(System.in);
        int number = (int) (100 * Math.random()) + 1;
        int attempts = 10;
        int i, guess;
        int repeat = 1;
        do {
            System.out.println("Guess the number between 1 to 100 within 10 attempts.");
            for (i = 1; i <= attempts; i++) {
                System.out.print("Guess the number: ");
                guess = sc.nextInt();
                if (number == guess) {
                    System.out.println("Congratulations!!" + " You guessed the number in " + i + " attempts.");
                    System.out.println("Your score is " + ((11 - i) * 10) + " out of 100");
                    break;
                } 
                else if (number > guess) {
                    System.out.println("The number is " + "greater than " + guess);
                    System.out.println("Attempts left: " + (attempts - i));
                } 
                else if (number < guess) {
                    System.out.println("The number is " + "less than " + guess);
                    System.out.println("attempts left: " + (attempts - i));
                }
            }
            if (i == attempts + 1) {
                System.out.println("Sorry, You have exhausted 10 attempts.");
                System.out.println("The number was " + number);
            }
            System.out.println("Do you want to play the game again? Enter 1 if yes otherwise enter 0");
            repeat = sc.nextInt();
            if (repeat == 0) {
                System.out.println("Thanks for playing!!");
                break;
            }
        } while (repeat == 1);
        sc.close();
    }

    public static void main(String[] args) {
        numberGuessing();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
        int rightGuess = random.nextInt(100);
        int turns = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100. You have 10 turns.\n");

        int guess;
        boolean win = false;
        
        while (!win && turns < 10) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            turns++;
            
            if (guess == rightGuess) {
                win = true;
            } else if (guess < rightGuess) {
                System.out.println("Your guess is lower than the correct number! Turns left: " + (10 - turns) + "\n");
            } else {
                System.out.println("Your guess is higher than the correct number! Turns left: " + (10 - turns) + "\n");
            }
        }

        if (win) {
            System.out.println("Congratulations! You guessed the correct number.");
            System.out.println("The number was " + rightGuess);
            int score = (11 - turns) * 10;
            System.out.println("You used " + turns + " turns to guess the right number");
            System.out.println("Your score is " + score + " out of 100");
        } else {
            System.out.println("You lost! The correct answer was: " + rightGuess);
        }

        scanner.close();
	}

}

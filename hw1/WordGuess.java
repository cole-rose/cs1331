import java.util.Random;
import java.util.Scanner;

/**
 * Represents a 3 letter word guessing game with 5 tries per each game
 *
 * @author crose37
 * @version 1.5
 */

public class WordGuess {

    static final String[] CANDIDATES = {"cat", "dad", "dog", "mom", "rat"};

    /**
    * 
    * @param args supplies command-line arguments as an array of String objects
    */
    public static void main(String[] args) {
        String secretWord = args.length > 0
            ? CANDIDATES[Integer.parseInt(args[0])]
            : CANDIDATES[new Random().nextInt(CANDIDATES.length)];

        // Your code goes here:
        int attempts = 5;
        StringBuilder missedLetters = new StringBuilder();
        StringBuilder currentGuess = new StringBuilder();
        currentGuess.append("___");
        //System.out.println(secretWord);
        boolean winner = false;
        while (attempts > 0 && !winner) {
            if (attempts > 0) {
                System.out.print("Missed letters (" + attempts + " left): ");
                System.out.println(missedLetters);
                System.out.println("Current guess: " + currentGuess);
                System.out.print("Guess a letter: ");
            }
            Scanner guessIt = new Scanner(System.in);
            char guess = guessIt.next().charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (guess == secretWord.charAt(i)) {
                    correctGuess = true;
                    currentGuess.setCharAt(i, guess);
                }
            }

            if (!correctGuess) {
                missedLetters.append(guess);
                attempts--;
            }

            if (currentGuess.toString().equals(secretWord)) {
                System.out.println("Missed letters: " + missedLetters);
                System.out.println("Final guess: " + currentGuess);
                System.out.println("Congratulations! You got it!");
                winner = true;
            }

            if (attempts == 0) {
                System.out.println("Missed letters: " + missedLetters);
                System.out.println("Final guess: " + currentGuess);
                System.out.print("Sorry, too many misses. ");
                System.out.println("The secret word was " + secretWord);
            }
            System.out.println();
        }
    }
}
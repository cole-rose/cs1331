import java.util.Random;
import java.util.Scanner;
 
//http://bit.ly/2rEGK2g
 
public class GuessNumber {
 
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(10);
        System.out.println(secretNumber);
 
        Scanner scanner = new Scanner(System.in);
        boolean keepAsking = true;
         
        while (keepAsking) {
            System.out.println("Guess a number please");
            String userInput = scanner.nextLine();
 
            if (userInput.equals("quit")) {
                System.out.println("Lame, the number was " + secretNumber + "I didn't know you were a quitter");
                keepAsking = false;
            } else {
                int guess = Integer.parseInt(userInput);
                if (guess > secretNumber) {
                    System.out.println("Lower");
                } else if (guess < secretNumber) {
                    System.out.println("Higher");
                } else {
                    System.out.println("You guessed correctly! the number was: " + secretNumber);
                    keepAsking = false;
                }
            }
 
        }
 
        // As long as the user guesses incorrectly or doesn’t enter
        // "quit" the program should keep asking the user to keep
        // guessing.
 
        //    If the user guesses the correct number then, before
        //    exiting, print "Yay! You guessed it. It was N." where N
        //    is the randomly chosen secret number.
 
        //    If the user guesses incorrectly print "Higher" or
        //    "Lower" depending on whether the secret number is higher
        //    or lower than the guess.
 
        //    If the user quits before guessing correctly print
        //    "Lame. It was N." where N is the randomly chosen secret
        //    number.
    }
    }
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Represents a modification of the Battleship board game
 *
 * @author crose37
 * @version 2.4
 */
public class Battleship {
     /**
    * creates a game board for a player
     *
     * @param n number representing size of the n X n board
     * @return returns a 2-D array of an empty game board
     */

    public static char[][] initBoard(int n) {
        // YOUR CODE BELOW: initializes a board of size n * n
        char[][] boardArr = new char[n][n];
        for (int row = 0; row < boardArr.length; row++) {
            for (int col = 0; col < boardArr[row].length; col++) {
                boardArr[row][col] = '~';
            }
        }
        return boardArr;
    }
    /**
    * prints each players game board
     *
     * @param playerTurn inidicates whos turn it ishit
     * @param board takes in the players board
     * @param hitsLeft indicates the number of hits that a player has remaining
     */
    public static void printBoard(int playerTurn, char[][] board,
        int hitsLeft) {
        // YOUR CODE BELOW: prints the board and player information
        //  (as in the example output)
        System.out.print("Player " + playerTurn + " (");
        System.out.println(hitsLeft + " hits left):");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    /**
    * updates the board given the missile target and returns if a ship is hit
     *
     * @param board takes in the players board
     * @param target represents the target that was entered from command line
     * @param shipLocations array holding the opponents ship locations
     * @param hitsLeft integer holding the players number of hits left
     * @return returns number of hits remaining (hitsLeft)
     */
    public static int fireMissile(char[][] board, String target,
        String[] shipLocations, int hitsLeft) {
        // YOUR CODE BELOW: updates the board given the missile
        //  target and returns if a ship is hit
        int[] indeces = convertLocation(target);
        // System.out.println("Indeces 0: " + indeces[0]);
        // System.out.println("Indeces 1: " + indeces[1]);
        if (isShip(target, shipLocations)) {
            System.out.println("Hit!");
            board[indeces[0]][indeces[1]] = 'X';
            return hitsLeft;
        } else {
            System.out.println("Miss!");
            board[indeces[0]][indeces[1]] = 'O';
        }
        return hitsLeft - 1;
    }
      /**
    * returns if a specific location is a ship
     *
     * @param target represents the target that was entered from command line
     * @param shipLocations array holding the opponents ship locations
     * @return true if the location contains a ship, false otherwise
     */
    public static boolean isShip(String target, String[] shipLocations) {
        // YOUR CODE BELOW: returns if location is ship
        for (int i = 0; i < shipLocations.length; i++) {
            if (target.equals(shipLocations[i])) {
                return true;
            }
        }
        return false;
    }
      /**
    * returns the integer indices corresponding with the coordinate string
     *
     * @param coordinate String containing the entered coordinate
     * @return returns the indeces as an integer array
     */
    public static int[] convertLocation(String coordinate) {
        // YOUR CODE BELOW: returns the integer indices corresponding
        //  with the coordinate string
        int[] index = new int[2];
        index[0] = coordinate.substring(0, 1).toLowerCase().charAt(0) - 'a';
        index[1] = Character.getNumericValue(coordinate.charAt(1)) - 1;
        return index;
    }
      /**
    * returns whether a not a location has been previously tried
     *
     * @param locationsUsed String array containing attempted locations
     * @param location location entered by the player
     * @return true if the location has been used, otherwise false
     */
    public static boolean usedLocation(String[] locationsUsed,
        String location) {
        for (int i = 0; i < locationsUsed.length; i++) {
            if (location.equals(locationsUsed[i])) {
                System.out.println(location + " has already been chosen");
                return true;
            }
        }
        return false;
    }
    /**
    * @param args supplies command-line arguments as an array of String objects
    */
    public static void main(String[] args) {
        int fileInd = (args.length > 0) ? Integer.parseInt(args[0])
            : new Random().nextInt(4);

        String filename = "game" + fileInd + ".txt";

        try {
            Scanner fileReader = new Scanner(new File(filename));
            Scanner inputScanner = new Scanner(System.in);
            // YOUR CODE BELOW: carries out the execution of the game
            //  using the methods defined above
            int player = 1;
            int otherPlayer = 3 - player;
            int boardSize = Integer.parseInt(fileReader.nextLine());
            char[][] gameBoard1 = initBoard(boardSize);
            char[][] gameBoard2 = initBoard(boardSize);
            String locations2 = fileReader.nextLine();
            String locations1 = fileReader.nextLine();
            String[] locationsArr1 = locations1.split(" ");
            String[] locationsArr2 = locations2.split(" ");
            int hitsRemaining1 = locationsArr1.length;
            int hitsRemaining2 = locationsArr2.length;
            // System.out.println(hitsRemaining1);
            // System.out.println(hitsRemaining2);
            String[] locationsUsed1 = new String[hitsRemaining1];
            String[] locationsUsed2 = new String[hitsRemaining2];
            int prevHitsRem1 = hitsRemaining1, prevHitsRem2 = hitsRemaining1;
            int totalHits1 = 0, totalHits2 = 0;
            int hitsNeeded = hitsRemaining1;
            int nextIndex1 = 0, nextIndex2 = 0;
            while (hitsRemaining1 >= 0 && hitsRemaining2 >= 0) {
                // System.out.println(locations1);
                // System.out.println(locations2);
                if (player == 1) {
                    printBoard(player, gameBoard2, hitsRemaining1);
                } else {
                    printBoard(player, gameBoard1, hitsRemaining2);
                }
                System.out.println();
                System.out.print("Player " + player);
                System.out.print(" enter missle location: ");
                String location = inputScanner.nextLine();
                if (player == 1) {
                    if (!usedLocation(locationsUsed1, location)) {
                        hitsRemaining1 = fireMissile(gameBoard2, location,
                            locationsArr1, hitsRemaining1);
                        printBoard(player, gameBoard2, hitsRemaining1);
                        if (hitsRemaining1 < 0) {
                            System.out.print("Player " + otherPlayer);
                            System.out.print(" wins!");
                        } else if (prevHitsRem1 == hitsRemaining1) {
                            totalHits1++;
                        }
                        locationsUsed1[nextIndex1] = location;
                        nextIndex1++;
                    } else {
                        hitsRemaining1--;
                    }
                } else {
                    if (!usedLocation(locationsUsed2, location)) {
                        hitsRemaining2 = fireMissile(gameBoard1, location,
                            locationsArr2, hitsRemaining2);
                        printBoard(player, gameBoard1, hitsRemaining2);
                        if (hitsRemaining2 < 0) {
                            System.out.print("Player " + otherPlayer + "wins!");
                        } else if (prevHitsRem2 == hitsRemaining2) {
                            totalHits2++;
                        }
                    } else {
                        hitsRemaining2--;
                    }
                    locationsUsed2[nextIndex2] = location;
                    nextIndex2++;
                }
                if (totalHits2 == hitsNeeded || totalHits1 == hitsNeeded) {
                    System.out.print("Player " + player + " wins!");
                }
                System.out.println("\n");
                System.out.println("----------" + "\n" + "\n");
                player = 3 - player;
                otherPlayer = player;
                prevHitsRem1 = hitsRemaining1;
                prevHitsRem2 = hitsRemaining2;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Make sure that " + filename
                + " is in the current directory!");
        }
    }
}
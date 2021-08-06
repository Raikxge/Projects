10import java.util.*;

public class game {
    // I designed this game on Microsoft Visual Studio. If you are using Eclipse
    // please create a package and class in your project to run the code.

    // Initialising two Array Lists to hold the 'X' and 'O' positions.
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    // These counters will keep track of how many times each player has won the
    // game.
    static int playerScore = 0;
    static int cpuScore = 0;

    public static void main(String args[]) {

        boolean replay = true;
        Scanner scan2 = new Scanner(System.in);
        while (replay) {
            playerPositions.clear();
            cpuPositions.clear();
            // GameBoard visual output
            char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' },
                    { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

            printGameBoard(gameBoard);

            boolean gameState = true;
            // This loop executes the input creating the player/CPU turn system and
            // continues to run until a condition is met.
            while (gameState) {
                System.out.println("\n(Enter your slot number) \n(*psst* It's from 1-9) - ^(O,O)^");
                Scanner scan1 = new Scanner(System.in);
                int playerPos = scan1.nextInt();

                // Checks to see if user input is valid
                if (playerPos > 9 || playerPos < 1) {
                    System.out.println("\n(Enter a valid input bro) - <(*-*)^");
                } else {

                    // Ensures that player cannot choose a slot occupied by CPU
                    while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                        System.out.println("\n<(0_0)^ - (This position is taken, try again)");
                        playerPos = scan1.nextInt();
                    }
                    placePiece(gameBoard, playerPos, "player");

                    // Checks to see if winCondition conditions have been met
                    String result = checkWinner();
                    if (result.length() > 0) {
                        printGameBoard(gameBoard);
                        System.out.println(result);
                        break;
                    }

                    // Using a randomiser to insert values into the grid to create a turn based
                    // game.
                    Random rand = new Random();
                    int cpuPos = rand.nextInt(9) + 1;
                    while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                        cpuPos = rand.nextInt(9) + 1;
                    }
                    placePiece(gameBoard, cpuPos, "cpu");
                    printGameBoard(gameBoard);
                    result = checkWinner();
                    if (result.length() > 0) {
                        System.out.println(result);
                        break;
                    }

                }
            }
            // This code allows the user to play again and also keeps track of how many
            // matches are won by each player
            System.out.println("\nPlayer: " + playerScore + " || CPU: " + cpuScore);
            System.out.println("\nType RESTART to play again or any other key to Quit");
            String restart = scan2.nextLine().toUpperCase();
            if (restart.equals("RESTART")) {
                replay = true;
                System.out.println("\n(We're starting again you ready?)- <(^_O)>");
            } else {
                replay = false;
                if (playerScore > cpuScore) {
                    System.out.println("\n(You haven't seen the last of me) - <(o_O)>");
                } else {
                    System.out.println("\n(You have admitted defeat, bow before me mortal) - [_(-_-)_] ");
                }

            }

        }

    }

    // This method prints out the 2D Array as the visual TicTacToe grid
    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char draw : row) {
                System.out.print(draw);
            }
            System.out.println();
        }
    }

    // This method uses User input to determine where to insert 'X' and 'O' into the
    // 2D Array
    public static void placePiece(char[][] gameBoard, int playerPos, String user) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(playerPos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(playerPos);
        }
        switch (playerPos) {

            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    // Specifies the conditions needed to win the game (Placement Combinations) this
    // method is called in the main method
    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);
        List<Integer> column1 = Arrays.asList(1, 4, 7);
        List<Integer> column2 = Arrays.asList(2, 5, 8);
        List<Integer> column3 = Arrays.asList(3, 6, 9);
        List<Integer> diagonal1 = Arrays.asList(1, 5, 9);
        List<Integer> diagonal2 = Arrays.asList(3, 5, 7);

        List<List> winCondition = new ArrayList<List>();
        winCondition.add(topRow);
        winCondition.add(midRow);
        winCondition.add(botRow);
        winCondition.add(column1);
        winCondition.add(column2);
        winCondition.add(column3);
        winCondition.add(diagonal1);
        winCondition.add(diagonal2);

        // Returns a specific output for each possible outcome of the game.
        for (List<?> l : winCondition) {
            if (playerPositions.containsAll(l)) {
            	playerScore++;
                return ("\n<(-_-)> - (You Win, Lets try again...)");                
            } else if (cpuPositions.containsAll(l)) {
            	cpuScore++;
                return ("\n[_(^,^)_] - (AHAHAHAH You lose, I am the superior being)");                
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return ("\nd=(*o*)=p - (Its a tie! Me and You, we're gonna throw down again!)");
            }
        }
        return "";
    }
}
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame obj = new GuessGame();
        obj.startGame();
    }
}

class Player {

    int number;

    void guess() {
        this.number = (int) (Math.random() * 10);
    }
}

class GuessGame {

    Player player1, player2, player3;

    void startGame() {

        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessPlayer1, guessPlayer2, guessPlayer3;
        final int targetNumber = (int) (Math.random() * 10);
        int numberOfTriesUntil1PlayerSucceed = 0;
        boolean isPlayer1Right = false, isPlayer2Right = false, isPlayer3Right = false;

        System.out.println("System is thinking of a number between 0 and 9...");
        System.out.println("Number to guess is " + targetNumber);

        System.out.println("GAME COMMENCE\n\n");

        while (true) {

            ++numberOfTriesUntil1PlayerSucceed; // Increment the number of tries

            System.out.println("Try Number: " + numberOfTriesUntil1PlayerSucceed + "\n");

            player1.guess(); // Players start guessing
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Player1 guessed " + guessPlayer1);

            guessPlayer2 = player2.number;
            System.out.println("Player2 guessed " + guessPlayer2);

            guessPlayer3 = player3.number;
            System.out.println("Player3 guessed " + guessPlayer3);

            if (guessPlayer1 == targetNumber) {
                isPlayer1Right = true;
            }
            if (guessPlayer2 == targetNumber) {
                isPlayer2Right = true;
            }
            if (guessPlayer3 == targetNumber) {
                isPlayer3Right = true;
            }
            if (isPlayer1Right || isPlayer2Right || isPlayer3Right) {
                System.out.println("\n\nWe have a winner!\n\n");
                System.out.println("Player1 got it right? " + isPlayer1Right);
                System.out.println("Player2 got it right? " + isPlayer2Right);
                System.out.println("Player3 got it right? " + isPlayer3Right);
                System.out.println("***************************************");
                break; // Game Over, so break out loop
            } else {
                System.out.println("Players have to try again!");
                System.out.println("***************************************\n\n");
            }
        }
        System.out.println("Game Over!");
    }
}

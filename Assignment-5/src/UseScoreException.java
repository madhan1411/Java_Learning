import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


class ScoreException extends Exception {
    public ScoreException(String s) {
        super(s);
    }
}

public class UseScoreException {
    public static void main(String[] args) throws NumberFormatException, ScoreException {
        int score;
        String bol;
        String scr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Score:");
        score = sc.nextInt();
        while (true) {
            try {
                playerScore(score);
                break;
            } catch (ScoreException e) {

                System.out.println(e.getMessage());
            } catch (NumberFormatException e1) {
                throw new NumberFormatException("You must enter a number for the score!");
            }
            System.out.println("Do you want to enter another score?");
            bol = sc.next();
            if (Objects.equals(bol, "Yes")) {
                System.out.println("Enter the Score:");
                scr = sc.next();
                playerScore(parseInt(scr));
            }

        }
    }


    static void playerScore(int n) throws ScoreException, NumberFormatException {
        if (n < 0 || n > 100) {
            throw new ScoreException("The score must be >= 0 and <= 100");
        } else {
            System.out.println("Entered score is valid");

        }
    }
}

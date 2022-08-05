import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws IOException {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Four digit number without 0 and 1:");
        num = input.nextInt();
        char[][] numberLetters = {
                {'0', '0', '0'}, {'1', '1', '1'}, {'A', 'B', 'C'},
                {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'},
                {'M', 'N', 'O'}, {'P', 'R', 'S'},
                {'T', 'U', 'V'}, {'W', 'X', 'Y'}};
        char[] word = new char[4];
        PrintStream printStream ;


        printStream=new PrintStream("C:\\Users\\signi\\IdeaProjects\\Java_Learning\\Assignment-6\\src\\combinationWords.txt");
        try {
            String temp=Integer.toString(num);
            char[] chars=temp.toCharArray();
            int[] digit = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                digit[i] = Integer.parseInt(String.valueOf(chars[i]));
            }
                for (int level0 = 0; level0 < 3; level0++) {
                    word[0] = numberLetters[digit[0]][level0];

                    for (int level1 = 0; level1 < 3; level1++) {
                        word[1] = numberLetters[digit[1]][level1];

                        for (int level2 = 0; level2 < 3; level2++) {
                            word[2] = numberLetters[digit[2]][level2];

                            for (int level3 = 0; level3 < 3; level3++) {
                                word[3] = numberLetters[digit[3]][level3];
                                printStream.printf("\t%s",String.valueOf(word));
                            }
                            printStream.println();
                        }

                    }
                }

            System.out.println("File written.");

        } catch (Exception exception) {
            System.out.println("Error writing to file." + exception);

        }


    }

}






import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class StudentPoll {

    private final int[] frequency = new int[7];

    private Scanner input;
    public Formatter output;


    public StudentPoll() {

    }

    // enable user to open file
    public void openFile() {
        try {
            input = new Scanner(new File("C:\\Users\\signi\\IdeaProjects\\Java_Learning\\Assignment-6\\src\\numbers.txt"));
            output = new Formatter("C:\\Users\\signi\\IdeaProjects\\Java_Learning\\Assignment-6\\src\\output.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("FileNotFoundException: Error opening or creating file.");
            fileNotFoundException.printStackTrace();
        }
    }


    //
    public void readResults() {

        Student student = new Student();

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        try {
            while (input.hasNext()) {
                student.setResponse(input.nextInt());

                try {
                    ++frequency[student.getResponse()];
                } // end try
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                    System.out.printf(" Out of bounds value: %d/n", student.getResponse());
                    System.out.println("Values entered must be 1 and 6. Or any value in between.");
                }


            }

            output.format("%s%10s%n", "Rating", "Frequency");
            for (int rating = 1; rating < frequency.length; rating++) {

                output.format("%6d%10d%n", rating, frequency[rating]);
                System.out.printf("%6d%10d\n", rating, frequency[rating]);
            }
        } catch (FormatterClosedException formatterClosedException) {
            System.err.println("FormatterClosedException: Error writing to file.");
            formatterClosedException.printStackTrace();
        } catch (IllegalStateException stateException) {
            System.err.println("IllegalStateException: Error reading from file.");
            System.out.println(stateException);
        }
    }


    public void closeFile() {
        if (input != null)
            input.close();
        if (output != null)
            output.close();
    }

    public static class Main {

        public static void main(String[] args) {

            StudentPoll poll = new StudentPoll();
            poll.openFile();
            poll.readResults();
            poll.closeFile();

        }

    }

    public static class Student {

        private int response;


        public Student() {
            this(0);
        }


        public Student(int resp) {
            setResponse(resp);
        }


        public int getResponse() {
            return response;
        }

        public void setResponse(int response) {
            this.response = response;
        }

    }
}


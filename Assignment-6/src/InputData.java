import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputData {

    private Formatter output;
    private Scanner input;


    public void openFile() {

        try {
            output = new Formatter("C:\\Users\\signi\\IdeaProjects\\Java_Learning\\Assignment-6\\src\\numbers.txt");
        } catch (SecurityException securityException) {
            System.err.println("SecurityException: You do not have write access to this file.");
            securityException.printStackTrace();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("FileNotFoundException: Error opening or creating file.");
            fileNotFoundException.printStackTrace();
        }
    }


    public void addStudent() {


        Student student = new Student();

        input = new Scanner(System.in);
        String end = "";


        while (!end.equals("Yes")) {
            System.out.printf("%s", "Enter your response (1 to 6)? ");
            try {

                student.setResponse(input.nextInt());

                if ((student.getResponse() > 0) && (student.getResponse() < 7)) {

                    output.format("%d%n", student.getResponse());
                } else {
                    System.out.println("Values entered must be 1 and 6. Or any value in between.");
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("FormatterClosedException: Error writing to file.");
                formatterClosedException.printStackTrace();
            } catch (NoSuchElementException elementException) {
                System.err.println("NoSuchElementException: Invalid input. Please try again.");
                input.nextLine();
            }

            System.out.println("Is this end of file:");
            end = input.next();
        }
    }


    public void closeFile() {
        if (input != null) input.close();
        if (output != null) output.close();
    }


    public static class Main {

        public static void main(String[] args) {

            InputData data = new InputData();
            data.openFile();
            data.addStudent();
            data.closeFile();

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

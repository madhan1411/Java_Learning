import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    void myMethod(int num) throws IOException {
        if (num == 1)
            throw new IOException("IOException Occurred");
        else
            System.out.printf("Entered integer is:%d", num);
    }
}

class Example1 {
    public static void main(String[] args) {
        try {
            Q1 obj = new Q1();
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("Enter an integer:");
            n = sc.nextInt();
            obj.myMethod(n);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
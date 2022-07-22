import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        input = sc.nextLine();
        System.out.println(Hex(input));

    }

    static String Hex(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int a = (int) ch;
            String hexString = Integer.toHexString(a);
            res += hexString;

        }
        return res;
    }

}

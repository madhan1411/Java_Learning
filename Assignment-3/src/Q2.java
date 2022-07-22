import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        input = sc.nextLine();
        System.out.println(RevStr(input));
    }

    private static String RevStr(String s) {
        String first = "";
        String middle="";
        String last = "";
        String[] str = s.split(" ");
        int n=str.length;

        for (int i = n- 1; i >= 0; i--) {
            StringBuilder input1 = new StringBuilder();
            if (i ==  n- 1){
                first = str[i];
            } else if (i == 0) {
                last = str[i];
            } else {
                input1.append(" " + str[i] + " ");
                middle+=input1.reverse();
                input1=null;
            }
        }
        return first + middle+ last;
    }
}

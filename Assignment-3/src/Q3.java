import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        input = sc.nextLine();
        System.out.println(cmnSubStr(input));
    }

    private static String cmnSubStr(String s) {
        String res = "";
        String[] str = s.split(" ");
        int len = str.length;
        String s1 = str[0];
        int n = s1.length();
        String subStr;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                subStr = s1.substring(i, j);
                int k;
                for (k = 1; k < len; k++) {
                    if (!str[k].contains(subStr))
                        break;
                }
                if (k == len && res.length() < subStr.length())
                    res = subStr;
            }

        }
        return res;
    }
}

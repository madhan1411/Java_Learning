import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String input1;
        String input2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String1:");
        input1 = sc.nextLine();
        System.out.print("Enter a String2:");
        input2 = sc.nextLine();
        System.out.println(anagram(input1, input2));
    }

    private static String anagram(String s, String s1) {
        String[] arr = s.split("");
        String[] arr1 = s.split("");
        int m = arr.length;
        int n = arr1.length;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr[i].equals(arr1[j])) {
                i++;
                j++;
                if (j == m)
                    return "Given strings are anagrams";
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return "Given strings are not anagrams";
    }
}

import java.util.Scanner;

public class Q2 {
    static char[] stack;
    static int top = -1;

    static void push(char ele) {
        stack[++top] = ele;
    }

    static char pop() {
        return stack[top--];
    }

    static int isPalindrome(char[] str) {
        int length = str.length;


        stack = new char[length * 4];


        int i, mid = length / 2;

        for (i = 0; i < mid; i++) {
            push(str[i]);
        }


        if (length % 2 != 0) {
            i++;
        }


        while (i < length) {
            char ele = pop();


            if (ele != str[i])
                return 0;
            i++;
        }

        return 1;
    }

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        input = sc.nextLine();
        char[] str = input.toCharArray();
        if (isPalindrome(str) == 1) {
            System.out.print("Given string is a palindrome");
        } else {
            System.out.print("Given string is not a palindrome");
        }
    }
}

package com.assignments;

import java.util.Scanner;

public class Digitsnum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=input.nextInt();
        StringBuilder res = new StringBuilder();
        while (num>0){
            int rem;
            rem=num%10;
            res.insert(0, rem + "   ");
            num=num/10;

        }
        System.out.println(res);
    }
}

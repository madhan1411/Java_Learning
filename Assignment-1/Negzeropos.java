package com.assignments;

import java.util.Scanner;

public class Negzeropos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int neg=0,zero = 0,pos=0;
        int num=5;
        int[] arr=new int[5];
        System.out.println("Enter Five numbers:");
        arr[0] = sc.nextInt();
        if (arr[0] == 0) {
            zero += 1;
        } else if (arr[0] < 0) {
            neg += 1;

        } else {
            pos += 1;
        }

        arr[1] = sc.nextInt();
        if (arr[1] == 0) {
            zero += 1;
        } else if (arr[1] < 0) {
            neg += 1;

        } else {
            pos += 1;
        }

        arr[2] = sc.nextInt();
        if (arr[2] == 0) {
            zero += 1;
        } else if (arr[2] < 0) {
            neg += 1;

        } else {
            pos += 1;
        }

        arr[3] = sc.nextInt();
        if (arr[3] == 0) {
            zero += 1;
        } else if (arr[3] < 0) {
            neg += 1;

        } else {
            pos += 1;
        }

        arr[4] = sc.nextInt();
        if (arr[4] == 0) {
            zero += 1;
        } else if (arr[4] < 0) {
            neg += 1;

        } else {
            pos += 1;
        }
        System.out.printf("Number of negative numbers are %d\n",neg);
        System.out.printf("Number of Zero numbers are %d\n",zero);
        System.out.printf("Number of positive numbers are %d",pos);

    }
}

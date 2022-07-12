package com.assignments;

import java.util.Scanner;

public class Twonum {
    //Q1
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two integers:" );
        num1=input.nextInt();
        num2=input.nextInt();
        if(num1==num2){
            System.out.println("These Numbers are equal");
        } else if (num1>num2) {
            System.out.printf("%d is Larger",num1);

        }
        else {
            System.out.printf("%d is larger",num2);
        }

    }
}

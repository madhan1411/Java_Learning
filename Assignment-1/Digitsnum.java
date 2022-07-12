package com.assignments;

import java.util.Scanner;

public class Digitsnum {
    //Q2
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=input.nextInt();
        int rem;
        String res="";
        for(int i=0;i<5;i++){
            rem=num%10;
            if(i==0){
                res+=rem;
            }
            else{
                res=rem+"   "+res;
            }
            num/=10;
        }
        System.out.println(res);
    }
}

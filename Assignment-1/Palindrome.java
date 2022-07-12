package com.assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner acn = new Scanner(System.in);
        int ch=0;
        while(true)
        {
            System.out.print("Enter A Five Digit Number : \n");
            int no=acn.nextInt();
            String sno=String.valueOf(no);
            if(sno.length()<5 ||sno.length()>5)
            {
                System.out.print("Length Is Not 5 Digits. Continue?(0)Yes/(1)No\n");
            }
            else
            {
                boolean flag=true;
                int i=0;
                int len=sno.length();
                for(i=0;i<sno.length()/2;i++)
                {
                    if(sno.charAt(i)!=sno.charAt(len-1))
                        flag=false;
                    len--;
                }
                if(flag)
                    System.out.println("Number Is Palindrome");
                else
                    System.out.println("Number Is Not Palindrome");
            }
            ch=acn.nextInt();
            if(ch==1)
                break;
        }
    }
}

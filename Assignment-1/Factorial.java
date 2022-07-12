package com.assignments;

public class Factorial {
    public static void main(String[] args) {
        int flag=20;
        long res=1; 
        for(int i=1;i<=flag;i++)
        {
            for (int j=1;j<=i;j++)
            {
                res=res*j;
            }
            System.out.println(res);
            res=1;
        }
    }
}

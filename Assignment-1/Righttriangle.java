package com.assignments;


public class Righttriangle {
    //Q7
    public static void main(String[] args) {
        long a, b, c;


        for(a=1;a<=500;a++)
        {
            for(b=a+1;b<=500;b++)
            {
                for(c=b+1;c<=500;c++)
                {
                    if(a*a + b*b == c*c)
                    {
                        System.out.printf("%d\t %d \t %d\t\n",a,b,c);
                    }
                }
            }
        }
    }
}

package com.assignments;

import java.util.Scanner;

public class Squareasterisks
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of side of a square:");
        int side;
        side = input.nextInt();
        if (side > 0 && side < 20)
        {
            for (int i = 0; i < side; i++)
            {
                if (i == 0 || i == side - 1)
                {
                    for (int j = 0; j < side; j++)
                        System.out.print("*");
                }
                else
                {
                    System.out.print("*");
                    for (int j = 0; j < side - 2; j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }
}


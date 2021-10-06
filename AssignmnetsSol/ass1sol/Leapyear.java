package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("pls input a year");
        int year = input.nextInt();
        if(year%400==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            if(year % 100 !=0 && year % 4==0)
            {
                System.out.println("It is leap year");
            }
            else
            System.out.println("It is not a leap year");
        }
    }
}

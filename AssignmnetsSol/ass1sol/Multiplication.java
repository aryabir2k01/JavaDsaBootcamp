package com.company;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int i;
        for(i=1 ; i<=10 ;i++)
        {
            System.out.println(num*i);
        }
    }
}

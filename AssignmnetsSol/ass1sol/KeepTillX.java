package com.company;

import java.util.Scanner;

public class KeepTillX {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int sum=0;
        char ch;

        do
        {
            System.out.println("enter number");
            int num =in.nextInt();
            sum=sum+num;
            System.out.println("enter char");
            ch=in.next().charAt(0);
        }while(ch!='x');

        System.out.println(sum);
    }
}

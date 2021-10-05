package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        //type cating
        int num=(int)(712.23f);
        System.out.println(num);
        //automatic type promotion in expressions

//        int a= 257;
//       byte b = (byte)(a);//byte can store only till 256

//        byte a=40;
//        byte b =50;
//        byte c =100;
//        int d =(a*b)/c;//40 * 50 is 2000 not posiible to store in byte java automatically promotes it

//        int number ='A';//prints 65
//        System.out.println(number);

//        System.out.println(d);

    }
}

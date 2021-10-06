package com.company;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("input numbers");
        int num1=in.nextInt();
        int num2= in.nextInt();
        int max,min;
        if(num1>num2)
        {
            max=num1;
            min=num2;
        }
        else
        {
            max=num2;
            min=num1;
        }

        int i=1,j=1;
        while(i<=min)
        {

            if(num1%i==0 && num2%i==0)
            {j=i;}
            i++;
        }

        System.out.println("HCF is : "+j);
        while(max%num1!=0 && max%num2!=0)
        {
            max=max+1;
        }
        System.out.println("Lcm is : "+max);
    }
}

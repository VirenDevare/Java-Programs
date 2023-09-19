package com.viren;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        

        //type casting
        int num =(int)(67.53f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a= 357;
        byte b= (byte)(a);
        System.out.println(b);

    }
}

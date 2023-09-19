package com.viren;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.println("Please enter some input :");
//        int rollno = input.nextInt();
//        System.out.println("Roll number is : "+ rollno);


//        int a = 125_000_000; // we will get output as 125000000 (This helps to write big numbers in millions)
//        System.out.println(a);
        String name= input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}

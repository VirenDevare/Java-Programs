package com.viren;


public class Main {
    public static void main(String[] args) {
        //Q: Store a roll number
        int a = 19;

        //Q: store a person's name
        String name = "Virendra Devare";

        //Q: Store 5 roll number
        int rno1= 23;
        int rno2 = 34;
        int rno3 = 52;

        //syntax
        //datatype[] variable_name = new datatype[size]
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {23, 53, 46, 35, 24};

        int[] ros; // declaration of array/ rno is getting defined in the stack
        ros = new int[5]; //Initialization: actually here object is being created in the heap memory

//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        for (String element : arr) {
            System.out.println(element);
        }




    }
}
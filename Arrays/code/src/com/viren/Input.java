package com.viren;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // AArray of premitives
        int[] arr =  new int[5];
        arr[0] = 24;
        arr[1] = 25;
        arr[2] = 235;
        arr[3] = 83;
        arr[4] = 63;
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print( arr[i] + " ");
//        }

//        for(int num : arr) { //for every element in array, print the array
//            System.out.print(num + " "); // here num represent element of the array
//        }


        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Viren";
        System.out.println(Arrays.toString(str));

    }
}

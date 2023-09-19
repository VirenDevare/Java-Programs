package com.viren;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(34);
//        list.add(53);
//        list.add(63);
//        list.add(76);
//        list.add(23);
//        list.add(636);
//        list.add(5235);
//        list.add(523);
//        list.add(35);
//        list.add(134);
//
//        System.out.println(list.contains(134));
//
//        list.set(0, 99);
//
//        System.out.println(list);

        //Input
        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);
    }
}


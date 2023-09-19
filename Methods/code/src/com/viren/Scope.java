package com.viren;

public class Scope   {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Viren";

        {
            // int a = 100; // already initialized outside the block in the same method, hence you cannot initialize again.
            a = 78; // reassign the original ref variable to some other value
            int c = 99;
            name = "Parth";
            System.out.println(c);
            System.out.println(name);
            //values initialized in this block, will remain in this block
        }
//        System.out.println(c); // cannot use outside the block
        System.out.println(a);
        System.out.println(name);

        // Scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

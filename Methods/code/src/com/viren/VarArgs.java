package com.viren;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,53,645,76,43,36,7,73,735);
        muultiple(1,3,"Viren", "Devare", "laflaknf");
    }

    static void muultiple(int a, int b, String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

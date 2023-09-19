package com.viren;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,56,84};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0] = 99;
    }
}

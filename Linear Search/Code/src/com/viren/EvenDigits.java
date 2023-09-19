package com.viren;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(FindNumbers(nums));
//        System.out.println(digits(0));
    }

    static int FindNumbers(int[] nums){
        int count =0;
        for(int num =0; num < nums.length; num++){
            if (even(nums[num])){
                count++;
            }
        }
        return count;

    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    //count number of digits in a number
    static int digits(int num){

        if (num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        int count = 0;

        while(num>0){
            count++;
            num = num / 10;
        }

        return count;

    }


}

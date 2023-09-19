package com.viren;


public class Main {
    public static void main(String[] args) {
        int[] nums = { 23, 53, 64, 632, 63, 622 , 235, 42, 45, 36, 74, 74, 743, 98 };
        int target = 425;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element ==target) {
                return true ;
            }
        }

        //This line will execute if none of the return statement above have executed hence target not found
        return false;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element ==target) {
                return element ;
            }
        }

        //This line will execute if none of the return statement above have executed hence target not found
        return -1;
    }

    //search int the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element ==target) {
                return index;
            }
        }

        //This line will execute if none of the return statement above have executed hence target not found
        return -1;
    }
}
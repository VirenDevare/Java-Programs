// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -18765;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index of smallest number greater than equal to target
    static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        while(start <= end){
            // find the middle element
//            int mid = (start + end ) / 2; //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                // ans found
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
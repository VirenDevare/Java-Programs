// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 14, 16, 18};
        int target = -18765;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //return the index of greatest number less than equal to target
    //return -1 if it does not exist
    static int floor(int[] arr, int target){
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
        return end;
    }
}
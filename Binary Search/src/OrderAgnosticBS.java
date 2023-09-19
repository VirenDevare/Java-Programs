public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = { -2,  -1, 0, 2, 4, 5, 7, 8, 12, 52};
        int [] arr= {99, 83, 74, 43, 12, 7, 1, 0, -2, -32};
        int target = 7;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        //Find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }



        }
        return -1;
    }

}

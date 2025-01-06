package exercise2;

public class BinarySearch1 {

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while (left <= right){
            int mid = left + (right)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {3,5,6,7,12,19,25};
        int target = 14;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }



}

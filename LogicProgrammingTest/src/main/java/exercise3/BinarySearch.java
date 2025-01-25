package exercise3;

public class BinarySearch {


    static int binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length;
        while (left <= right){
            int mid = left + (right)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {3,6,9,12};
        int target = 9;

        int result = binarySearch(arr, target);


        System.out.println(result);
    }

}

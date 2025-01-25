package hackerrank;

import javax.management.remote.rmi.RMIConnectionImpl;

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

        //jika number  yang dicari tidak ada dalam array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,6,9,12,18,22};
        int target = 5;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }


}

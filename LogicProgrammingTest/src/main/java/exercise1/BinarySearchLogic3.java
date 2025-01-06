package exercise1;

public class BinarySearchLogic3 {

    // BinarySearch find num target in arr[], return -1 if not found

    static int getBinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while (left <= right){
            int mid = left + (right - left)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,11,15,20};
        int target = 9;

        int search = getBinarySearch(arr,target);
        if (search != -1){
            System.out.println("data ditemukan pada index ke - "+search);
        }else {
            System.out.println("data tidak ditemukan");
        }
    }




}

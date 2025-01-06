package exercise1;

public class BinarySearchLogic2 {

    //binarySearch find number, return -1 if not found

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;

        while (left <= right){
            int mid = left + (right-left)/2;

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
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int target = 12;

        int result = binarySearch(arr, target);
        if (result != -1){
            System.out.println("data ditemukan pada index ke - "+result);
        }else {
            System.out.println("data tidak ditemukan");
        }
    }

}

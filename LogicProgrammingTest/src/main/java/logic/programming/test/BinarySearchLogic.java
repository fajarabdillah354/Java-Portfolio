package logic.programming.test;

public class BinarySearchLogic {

    /*
    INPUT :
    - arr array integer yang sudah terurut secara asending
    - target adalah bilangan bulat yang harus dicari

    OUTPUT :
    - kembalikan index dari var target dalam array jika ditemukan
    - jika tidak ditemukan kembalikan -1
     */

    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left)/2;

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
        int arr[]={2,4,6,8,10,12};
        int target = 6;

        int result = new BinarySearchLogic().binarySearch(arr,target);

        if (result != -1){
            System.out.println("data ditemukan pada indekx ke = "+result);
        }else {
            System.out.println("data tidak ditemukan");
        }
    }


}

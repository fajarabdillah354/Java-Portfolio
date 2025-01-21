package exercise1;

public class BinarySearchLogic1 {

    //BinarySearch

    int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while (left <= right){
            int mid = left + (right)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                right = mid -1;
            }else {
                left = mid +1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,9,12,18,21,24};
        int target = 12;
        int result = new BinarySearchLogic1().binarySearch(arr, target);

        if (result != -1){
            System.out.println("data ditemukan pada index ke - "+result);
        }else {
            System.out.println("data tidak ditemukan");
        }
        System.out.println(arr.length);
//        System.out.println(arr[7]);
    }


}

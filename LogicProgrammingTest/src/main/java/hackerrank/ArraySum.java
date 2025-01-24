package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {


    // mencari target yang dicari dari parameter,
    // misal target = 4, dari array {3,2,5,7,19,32}
    // maka akan mengembalikan index dari target yang dicari
    // untuk requirement buat double loop



    static List<int[]> checkTargetArray(int[] arr, int target){
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] +  arr[j] == target){
                    result.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {3, 5, 6, 9, 10, 21, 41};
        int target = 15;
        List<int[]> twoSum = checkTargetArray(num, target);

        for (int[] result : twoSum){
            System.out.println(Arrays.toString(result));
        }
    }

}

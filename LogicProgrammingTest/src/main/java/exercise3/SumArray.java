package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArray {

    static List<int[]> twoSumArray(int[] num, int target){
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == target){
                    result.add(new int[]{num[i], num[j]});
                }
            }

        }
        return result;


    }


    public static void main(String[] args) {
        int[] arr = {1,4,5,9,10,13,16,20,26,30};
        int target = 23;

        List<int[]> array = twoSumArray(arr, target);
        for (int[] getArray : array){
            System.out.println(Arrays.toString(getArray));
        }
    }


}

package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArrayLogic {

    static List<int[]> twoSum(int[] num, int target){
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
        int[] num = {1,2,3,4,5,6,7};
        int target = 9;
        List<int[]> twoSum = twoSum(num, target);

        for (int[] getLoop : twoSum){
            System.out.println(Arrays.toString(getLoop));
        }
    }

}





package ExerciseLogic;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayManipulation {

    /*
    soal.
    Buat fungsi untuk menemukan dua angka dalam sebuah array yang jika dijumlahkan akan menghasilkan target tertentu.
     */

    public static int[] findTwoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x), i};
            }
            map.put(nums[i],i);
        }

        return new int[]{};//jika kosong(jika penjumlahan array tidak bisa memenuhi angka target)

    }

    public static void main(String[] args) {
        int[] result = findTwoSum(new int[]{3, 4, 6, 9, 12},9);//program akan menampilkan jika penjumlahan dari array sesuai dengan angkat target
        System.out.println(Arrays.toString(result));
    }

}

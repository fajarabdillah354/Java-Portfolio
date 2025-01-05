package enigmacampTest;

import java.util.List;

public class ArrayAverage2 {



    static double average(List<Integer> list){
        if (list.isEmpty() || list == null){
            return 0;
        }

        int sum = 0;
        for (int get : list) {
            sum += get;
        }

        return sum / list.size();

    }

    public static void main(String[] args) {
        double average = average(List.of(3, 5, 1, 10, 15));
        System.out.println(average);
    }



}

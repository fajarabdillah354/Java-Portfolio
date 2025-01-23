package hackerrank;

import java.util.List;

public class ArrayAverrage {


    static double average(List<Integer> list){

        if (list.isEmpty()){
            return 0;
        }

        double temp = 0;
        for(int getNewData : list){
            temp += getNewData;
        }

        return temp/list.size();


    }


    public static void main(String[] args) {
        System.out.println(average(List.of(2,3,5,10,15)));
    }



}

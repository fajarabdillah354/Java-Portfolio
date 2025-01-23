package hackerrank;

import java.util.List;

public class LargeAndSmallNumber {

    static void searchLargeSmall(){

        int[] number = {12,15,11,31,26};
        int largets = number[0], smalls = number[0];

        for (int getNum : number){
            if (getNum > largets){
                largets = getNum;
            } else if (getNum < smalls) {
                smalls = getNum;
                
            }
        }

        System.out.println("largest : "+ largets);
        System.out.println("smallest : "+ smalls);

    }

    public static void main(String[] args) {
        searchLargeSmall();
    }

}

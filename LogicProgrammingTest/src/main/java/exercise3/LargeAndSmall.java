package exercise3;

public class LargeAndSmall {

    static void isLargeSmall(){
        int[] num = {123,154,136,165,193};
        int large = num[0], small = num[0];

        for (int result : num){
            if (result > large) {
                large = result;
            } else if (result < small){
                small = result;
            }
        }

        System.out.println("large : "+large);
        System.out.println("small : "+small);
    }

    public static void main(String[] args) {
        isLargeSmall();
    }


}

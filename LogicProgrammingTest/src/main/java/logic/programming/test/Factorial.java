package ExerciseLogic;

public class Factorial {

    static int isFactorial(int n){
        if (n == 0 || n == 1){
            return 1;

        }else {
            return n * isFactorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(isFactorial(5));
    }




}

package hackerrank;

public class FactorialRecursive {

    static Integer factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }else {
            return num * (factorial(num -1 ));//dikali dirinya sendiri
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


}

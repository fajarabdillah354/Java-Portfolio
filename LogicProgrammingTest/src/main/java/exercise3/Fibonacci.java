package exercise3;

public class Fibonacci {


    static void fibonaci(int n){

        int first = 0, second = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        fibonaci(7);
    }



}

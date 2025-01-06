package exercise1;

public class FizzBuzzLogic {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {
        int n = 15;
        System.out.println("FizzBuzz for n = " + n + ":");
        fizzBuzz(n);
    }

}

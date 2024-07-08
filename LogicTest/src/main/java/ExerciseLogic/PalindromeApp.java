package ExerciseLogic;

public class PalindromeApp {

    static boolean isPalindrome(String text){
        String clean = text.toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward){
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar){
                System.out.println("text "+text+" bukan palindrome");
                return false;
            }
        }
        System.out.println("text "+text+" adalah palindrome " );
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("KODOK"));

    }


}

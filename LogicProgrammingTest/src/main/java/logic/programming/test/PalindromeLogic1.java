package logic.programming.test;

public class PalindromeLogic1 {

    static boolean isPalindrome(String text){
        String regex = text.replaceAll("\\s+","").toLowerCase();
        int length = regex.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward){
            char forwardChar = regex.charAt(forward++);
            char backwardChar = regex.charAt(backward--);
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
        System.out.println(isPalindrome("A man a plan a canal Panama"));

    }


}

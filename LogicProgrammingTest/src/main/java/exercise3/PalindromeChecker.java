package exercise3;

import javax.print.DocFlavor;

public class PalindromeChecker {

    static boolean isPalindrome(String text){
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String result = buffer.toString();
        if(result.equals(text)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String text = "kodok";
        System.out.println(isPalindrome(text));
    }

}

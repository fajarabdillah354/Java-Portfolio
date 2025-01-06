package logic.programming.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PalindromeLogic2 {


    public static Boolean validationPalindrome(String s){
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String data = buffer.toString();
        if (s.equals(data)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String string1 = "kodok";
        String string2 = "buaya";
        String string3 = "odo";

        boolean check1 = validationPalindrome(string1);
        boolean check2 = validationPalindrome(string2);
        boolean check3 = validationPalindrome(string3);
        log.info("{}",check1);
        log.info("{}",check2);
        log.info("{}",check3);
    }

}

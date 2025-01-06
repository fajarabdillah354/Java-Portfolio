package exercise1;

public class PalindromeLogic3 {
    // Palindrom with StringBuffer

    static boolean isPalindromeWithBuffer(String text){
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String toString = buffer.toString();
        if (text.equals(toString)){
            return true;
        }

        return false;
    }


    static boolean isPalindromeWithChart(String s){
        String toLowerCase = s.replaceAll("//s", "").toLowerCase();
        int length = toLowerCase.length();
        int forward = 0;
        int backward = length-1;
        while (forward < backward){
            char text1 = toLowerCase.charAt(forward++);
            char text2 = toLowerCase.charAt(backward--);
            if (text1 != text2){
                System.out.println(s+" bukan palindrome text");
                return false;
            }
        }

        System.out.println(s+" adalah palindrome text");
        return true;

    }




}

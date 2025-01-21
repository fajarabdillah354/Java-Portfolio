package exercise1;

public class PalindromeLogic1 {

    // Check Palindrome Text

    static boolean isPalindromeWithBuffer(String text){
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String reverse = buffer.toString();
        if (text.equals(reverse)){
            return true;
        }
        return false;
    }


    static boolean isPalindromWithChart(String s){
        String toLowerCase = s.replaceAll("//s","").toLowerCase();
        int length = toLowerCase.length();
        int forward = 0;
        int backward = length-1;
        while (forward < backward){
            char char1 = toLowerCase.charAt(forward++);
            char char2 = toLowerCase.charAt(backward--);
            if (char1 != char2){
                System.out.println("text :"+s+" bukan palindrome");
                return false;
            }
        }
        System.out.println("text : "+s+" adalah palindrome");
        return true;

    }

    public static void main(String[] args) {
        boolean palindrome1 = isPalindromeWithBuffer("kodok");//palindrome text
        System.out.println(palindrome1);

        boolean palindrome2 = isPalindromeWithBuffer("bermain sambil belajar");//bukan palindrome
        System.out.println(palindrome2);

        boolean palindromWithChart = isPalindromWithChart("kodok");
        System.out.println(palindromWithChart);

    }

}

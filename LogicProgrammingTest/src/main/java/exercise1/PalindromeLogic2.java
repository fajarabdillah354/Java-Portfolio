package exercise1;

public class PalindromeLogic2 {

    //palindrom text detector with chart

    static boolean isPalindromeWithChart(String s){
        String lowerCase = s.replaceAll("//s", "").toLowerCase();
        int length = lowerCase.length();
        int forward = 0;
        int backward = length-1;
        while (forward < backward){
            char text1 = lowerCase.charAt(forward++);
            char text2 = lowerCase.charAt(backward--);
            if (text1 != text2){
                System.out.println("text : "+s+" bukan palindrome");
                return false;
            }
        }
        System.out.println("text : "+s+" adalah palindrome");
        return true;

    }


    // Palindrom with StringBuffer

    static boolean isPalindromWithBuffer(String text){
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String data = buffer.toString();
        if (text.equals(data)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        boolean palindromeWithChart1 = isPalindromeWithChart("fajar");
        System.out.println(palindromeWithChart1);

        boolean palindromeWithChart2 = isPalindromeWithChart("level");
        System.out.println(palindromeWithChart2);

        boolean palindromWithBuffer = isPalindromWithBuffer("radar");
        System.out.println(palindromWithBuffer);

    }



}

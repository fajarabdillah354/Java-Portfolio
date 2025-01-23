package hackerrank;

public class PalindromeCheck {

    //palindrom with StringBuffer
    public boolean isPalindrome(String text){
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        String result =  buffer.toString();
        if (result.equals(text)){
            return true;
        }else {
            return false;
        }
    }


    //Palindrome with chart
    public boolean isPalindromeWithChart(String text){
        String lowerCase = text.replaceAll("//s", "").toLowerCase();
        int lenght = lowerCase.length();
        int forward = 0;
        int backward = lenght -1;
        while (forward < backward){
            char char1 = lowerCase.charAt(forward++);
            char char2 = lowerCase.charAt(backward--);
            if (char1 != char2){
                System.out.println(lowerCase + "  bukan palindrome");
                return false;
            }
        }
        System.out.println(lowerCase + " adalah kata palindrome");
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        System.out.println(palindromeCheck.isPalindrome("pupup"));
        System.out.println(palindromeCheck.isPalindromeWithChart("fafjar"));
    }


}

package hackerrank;

public class ReverseString {

    //buat fungsi yang digunakan untuk membalikkan string dengan StringBuilder/StringBuffer

    public static boolean isAnagram(String s){
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        String reverse = stringBuffer.toString();
        if (reverse.equals(s)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println( isAnagram("kodok"));
    }


}

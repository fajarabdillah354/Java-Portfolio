package exercise3;

public class AnagramChecker {

    static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("//s", "").toLowerCase();
        s2 = s2.replaceAll("//s", "").toLowerCase();

        if (s1.length()  != s2.length()){
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt('a')]++;
            count[s2.charAt('a')]--;
        }

        for (int result : count){
            if (result != 0){
                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {
        System.out.println(isAnagram("sepeda", "motor"));
    }


}

package exercise1;

public class AnagramChecker1 {

    //ANAGRAMSTRING

    static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("//s","").toLowerCase();
        s2 = s2.replaceAll("//s","").toLowerCase();

        if (s1.length() != s2.length()){
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int hitung : count){
            if (hitung != 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s1 = "fajar";
        String s2 = "jafar";
        System.out.println(isAnagram(s1,s2));
    }


}

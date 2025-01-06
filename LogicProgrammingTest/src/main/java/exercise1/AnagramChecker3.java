package exercise1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnagramChecker3 {

    //AnagramChecker String


    boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("//s","").toLowerCase();
        s2 = s2.replaceAll("//s","").toLowerCase();

        if (s1.length() != s2.length()){
            return false;
        }

        int[] countChar = new int[26];//26 total alphabet
        for (int i = 0; i < s1.length(); i++) {
            countChar[s1.charAt(i) - 'a']++;
            countChar[s2.charAt(i) - 'a']--;
        }

        for (int temp : countChar){
            if (temp != 0 ){
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        boolean anagram1 = new AnagramChecker3().isAnagram("ujeh","heju");
        boolean anagram2 = new AnagramChecker3().isAnagram("keju","uejk");
        boolean anagram3 = new AnagramChecker3().isAnagram("ganjar","gajah");
        log.info("{}",anagram1);
        log.info("{}",anagram2);
        log.info("{}",anagram3);
    }


}

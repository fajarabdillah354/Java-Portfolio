package logic.programming.test;

public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("//s","").toLowerCase();
        s2 = s2.replaceAll("//s","").toLowerCase();


        if (s1.length() != s2.length()){
            return false;
        }

        int[] count = new int[26];//26 total alphabet
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;//mengurangi setiap character yang ada di s1 ke alphabet 'a' contoh 'c' = 3, 'a' = 1 berarti 3-1=2,jika sudah akan dilanjut ke character berikutnya
            count[s2.charAt(i) - 'a']--;//mengurangi setiap character yang ada di s2 ke alphabet 'a',jika sudah akan dilanjut ke character berikutnya

        }



        for(int counter : count){
            if (counter != 0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("fajar","jafar"));
    }


}

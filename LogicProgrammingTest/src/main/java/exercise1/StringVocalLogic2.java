package exercise1;

import java.util.List;

public class StringVocalLogic2 {

     /*


    hitung jumlah huruf vokal himpunan karakter yang ada pada sebuah list yang telah diberikan, a i u e o sebagai vokal pembentuk kata yang diberikan pada method dengan parameter masukan berupa List String hanya terdiri dari huruf kecil
     */


    static void vowelVocal(List<String> list){
        int countVocal = 0;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.equals("a") || temp.equals("i") || temp.equals("u") || temp.equals("e") || temp.equals("o")){
                countVocal++;//akan bertambah jika terdeteksi dalam suatu list ada vocal a i u e o
            }
        }
        System.out.println("jumlah vocal aiueo pada list "+ list + " : "+countVocal);
    }

    public static void main(String[] args) {
        vowelVocal(List.of("a","b","d","i","l","l","a","h"));
    }

}

package exercise1;

import java.util.List;

public class StringVocalLogic1 {

    /*


    hitung jumlah huruf vokal himpunan karakter array String yang telah diberikan, a i u e o sebagai vokal pembentuk kata yang diberikan pada method dengan parameter masukan berupa List String hanya terdiri dari huruf kecil
     */

    void vowelVokal(List<String> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            if (temp.equals("a") || temp.equals("i") || temp.equals("u") || temp.equals("e") || temp.equals("a")){
                count ++;
            }
        }
        System.out.println("jumlah huruf vokal a i u e o dari "+ list + " : "+count);
    }


    public static void main(String[] args) {
        StringVocalLogic1 exercise7 = new StringVocalLogic1();
        exercise7.vowelVokal(List.of("n","u","r","a","s","i","a","h"));

    }


}

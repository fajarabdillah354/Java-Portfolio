package logic.programming.test;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class StringLogic {
    /*


    hitung jumlah huruf vokal himpunan karakter array String yang telah diberikan, a i u e o sebagai vokal pembentuk kata yang diberikan pada method dengan parameter masukan berupa List String hanya terdiri dari huruf kecil
     */

    public void vowelCount(List<String> arr){
        int arrCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            String temp = arr.get(i);
            if (temp.equals("a") || temp.equals("i") || temp.equals("u") || temp.equals("e") || temp.equals("o")){
                arrCount++;
            }
        }
//        log.info("jumlah yang terdapat vokal a i u e o : ",arrCount);
        System.out.println("jumlah vokal a i u e o yang terdapat dari "+arr+" adalah : "+arrCount);
    }

    public static void main(String[] args) {
        StringLogic stringLogic1 = new StringLogic();
        stringLogic1.vowelCount(List.of("f","a","j","a","r"));
        StringLogic stringLogic2 = new StringLogic();
        stringLogic2.vowelCount(List.of("s","i","t","i","a","n","i","s","a"));
    }
}

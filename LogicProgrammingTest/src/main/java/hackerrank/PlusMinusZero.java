package hackerrank;


import java.util.List;

/**
 * misal ada sebuah arr[n] = [2,2,0,-1,-1]
 * hasil output harus bilangand desimal dengan 6 angka di belakang koma (ex = 0.400000, 0.600000), yang didapet dari element array / size array
 * hasil cetak setiap array harus ditulis dengan baris baru
 * number harus mempunyai jumlah bilangan positif dan negatif yang sama  dan harus ada 0
 *
 */

public class PlusMinusZero {

    public static void plusMinus(List<Integer> arr){
        int n = arr.size();
        long positive = arr.stream().filter(count -> count > 0).count();
        long negative = arr.stream().filter(count -> count < 0).count();
        long zero = arr.stream().filter(count -> count == 0).count();

        System.out.printf("%.6f%n", (double) positive/n);
        System.out.printf("%.6f%n", (double) negative/n);
        System.out.printf("%.6f%n", (double) zero/n);

    }

    public static void main(String[] args) {
        plusMinus(List.of(6));
    }


}

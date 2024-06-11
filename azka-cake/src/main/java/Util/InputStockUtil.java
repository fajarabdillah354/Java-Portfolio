package Util;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class InputStockUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String util(String input){
        System.out.print(input+" : ");
        String data = scanner.nextLine();
        return data;
    }
}

package hackerrank.ObjectOrientedDesign.util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info){
        System.out.println(info+ " :");
        String getInput = scanner.next();
        return getInput;

    }

}

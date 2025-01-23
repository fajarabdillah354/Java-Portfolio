package StackInteview;


import java.util.HashMap;



public class StackValidationApp {


    //membuat method untuk mengembalikan nilai boolean
    public static boolean isValid(String s) {
        // membuat store macthing brackets
        HashMap<Character, Character> matchingBrackets = new HashMap<>();
        matchingBrackets.put(')', '(');
        matchingBrackets.put('}', '{');
        matchingBrackets.put(']', '[');

        // membuat object dengan class CustomStack
        CustomStack customStack = new CustomStack(s.length());

        //membuat perulangan dengan foreach
        for (char c : s.toCharArray()) {
            if (matchingBrackets.containsKey(c)) {
                // mengecek kalo stack yang paling atas tidak kosong dan stack yang di peek (diambil tanpa menghapus) itu sama dengan brackets yang di berikan di parameter
                // maka stack yang paling atas kita ambil
                if (!customStack.isEmpty() && customStack.peek() == matchingBrackets.get(c)) {
                    // ambil stack top
                    customStack.pop();
                } else {
                    return false;
                }
            } else {
                // push opening brackets kedalam stack
                customStack.push(c);
            }
        }
        // The stack should be empty if all brackets are balanced
        // kembalikan method isEmpty() karna jika semua brackets seimbang misal { } / ( )
        return customStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([{}])")); // true
        System.out.println(isValid("([)]")); // false
    }

}

package practice25;

import java.util.regex.Pattern;

public class Task1 {
    public static boolean cheakString(String input){
        return Pattern.matches("abcdefghijklmnopqrstuv18340", input);
    }

    public static void main(String[] args) {
        System.out.println(cheakString("abcdefghijklmnopqrstuv18340"));
        System.out.println(cheakString("abcdefghijklmnopqdfgdfgdfgd234rstuv18340"));

    }
}

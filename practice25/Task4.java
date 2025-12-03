package practice25;

import java.util.regex.Pattern;

public class Task4 {
    public static boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("user@example.com"));
        System.out.println(isValidEmail("myhost@@com.ru"));
        System.out.println(isValidEmail("@my.ru"));
    }
}

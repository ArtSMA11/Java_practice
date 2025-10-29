package practice14;

import java.util.regex.Pattern;

public class Task3 {
    public static boolean isValidDate(String date){
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|[2-9][0-9])\\d{2})$";
        return Pattern.matches(regex, date);
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("29/02/2000"));
        System.out.println(isValidDate("30/04/2003"));
        System.out.println(isValidDate("30-04-2003"));
        System.out.println(isValidDate("1/1/1899"));
    }
}

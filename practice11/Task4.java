package practice11;

import java.text.SimpleDateFormat;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            System.out.print("Введите месяц : ");
            int month = scanner.nextInt();
            System.out.print("Введите число: ");
            int day = scanner.nextInt();
            System.out.print("Введите часы: ");
            int hours = scanner.nextInt();
            System.out.print("Введите минуты: ");
            int minutes = scanner.nextInt();

            Date date = new Date(year - 1900, month - 1, day, hours, minutes);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            System.out.println("Date " + dateFormat.format(date));

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            calendar.set(Calendar.HOUR_OF_DAY, hours);
            calendar.set(Calendar.MINUTE, minutes);
            System.out.println("Calendar " + dateFormat.format(calendar.getTime()));
        }
        catch (Exception e){
            System.out.println("Ошибка ввода данных!");
        }
    }
}

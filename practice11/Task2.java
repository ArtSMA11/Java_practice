package practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            String InputDate = scanner.nextLine();
            Date currentData = new Date();
            Date inputDate = dateFormat.parse(InputDate);

            System.out.println("Текущая дата: " + dateFormat.format(currentData));
            System.out.println("Введенная дата: " + dateFormat.format(inputDate));

            if (inputDate.before(currentData)) {
                System.out.println("Введенная дата РАНЬШЕ текущей");
            }

            else if (inputDate.after(currentData)) {
                System.out.println("Введенная дата ПОЗЖЕ текущей");
            }

            else {
                System.out.println("Даты РАВНЫ");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты!");
        }
    }
}

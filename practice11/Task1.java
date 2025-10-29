package practice11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        Date startDate = new Date(125, 9, 23, 9, 0,0);
        Date endDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: Абаджян");
        System.out.println("Дата и время получения задания: " + dateFormat.format(startDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(endDate));
    }
}

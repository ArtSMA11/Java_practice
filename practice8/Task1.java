package practice8;

import java.util.*;

public class Task1 {
    public static void print(int now, int count, int n) {
        if (n == 0) return;  // Все числа вывели
        System.out.print(now + " ");
        if (count == 1) {
            // Переходим к следующему числу
            print(now + 1, now + 1, n - 1);
        } else {
            // Продолжаем текущее число
            print(now, count - 1, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        print(1, 1, n);
    }
}
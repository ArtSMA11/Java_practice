package practice8;

import java.util.*;

public class Task3 {
    public static void atob(int a, int b) {
        if (b - a < 0) {
            return;
        }
        atob(a, b - 1);
        System.out.print(b + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a и b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b - 1 < 0) {
            System.out.print("Error");
        } else {
            System.out.print("Ответ: ");
            atob(a, b);
        }
        scanner.close();
    }
}


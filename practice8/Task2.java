package practice8;

import java.util.*;

public class Task2 {
    public static void oneton(int n) {
        if (n <= 0) {
            return;
        }
        oneton(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        oneton(sc.nextInt());
    }
}

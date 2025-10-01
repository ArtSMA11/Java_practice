package practice2.circle;

import java.util.*;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public void printTester() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ")" + " " + circles[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        Tester test = new Tester(capacity);
        for (int i = 0; i < capacity; i++) {
            System.out.println("Введите координаты окружности и её радиус");
            Point point = new Point(0, 0);
            point.setX(scanner.nextDouble());
            point.setY(scanner.nextDouble());
            Circle circle = new Circle(point, scanner.nextDouble());
            test.addCircle(circle);
        }
        test.printTester();
    }
}

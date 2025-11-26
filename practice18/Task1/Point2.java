package practice18.Task1;

public class Point2 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0); // Выведет "Infinity"
    }

    public static void main(String[] args) {
        new Point2().exceptionDemo();
    }
}

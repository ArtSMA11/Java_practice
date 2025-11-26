package practice18.Task1;

public class Point1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public static void main(String[] args) {
        new Point1().exceptionDemo();
    }
}

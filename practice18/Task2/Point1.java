package practice18.Task2;

import java.util.*;

public class Point1 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }

    public static void main(String[] args) {
        new Point1().exceptionDemo();
    }
}

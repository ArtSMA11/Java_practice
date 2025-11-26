package practice18;

import practice18.Task2.Point2;

import java.util.*;
public class Task3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }
    public static void main (String[]args){
        new Task3().exceptionDemo();
    }
}
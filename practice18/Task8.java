package practice18;

import java.util.*;

public class Task8 {
    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            while (true) {
                try {
                    String key = myScanner.next();
                    printDetails(key);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid key, try again");
                }
            }
        }

        public void printDetails(String key) {
            String message = getDetails(key);
            System.out.println(message);
        }

        private String getDetails(String key) {
            if (key.equals("")) {
                throw new RuntimeException("Key set to empty string");
            }
            return "data for " + key;
        }

        public static void main(String[] args) {
            ThrowsDemo demo = new ThrowsDemo();
            demo.getKey();
        }
    }
}

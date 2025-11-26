package practice18;

import java.util.*;

public class Task7 {
    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            printDetails(key);
        }

        public void printDetails(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (Exception e) {
                throw e;
            }
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

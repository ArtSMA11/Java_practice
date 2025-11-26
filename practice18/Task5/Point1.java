package practice18.Task5;

public class Point1 {
    public static class ThrowsDemo {
        public void getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Key: " + key);
        }

        public static void main(String[] args) {
            ThrowsDemo demo = new ThrowsDemo();
            demo.getDetails(null);
        }
    }
}

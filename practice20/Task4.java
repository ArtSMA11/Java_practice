package practice20;

public class Task4 {
    public static class MinMax<T extends Comparable<T>> {
        private T[] array;

        public MinMax(T[] array) {
            this.array = array;
        }

        public T min() {
            T min = array[0];
            for (T element : array) {
                if (element.compareTo(min) < 0) {
                    min = element;
                }
            }
            return min;
        }

        public T max() {
            T max = array[0];
            for (T element : array) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Integer[] intArray = {3, 1, 4, 1, 5};
            MinMax<Integer> minMax = new MinMax<>(intArray);
            System.out.println("Min: " + minMax.min());
            System.out.println("Max: " + minMax.max());
        }
    }

    public static class Calculator {
        public static <T extends Number, U extends Number> double sum(T a, U b) {
            return a.doubleValue() + b.doubleValue();
        }

        public static <T extends Number, U extends Number> double multiply(T a, U b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number, U extends Number> double divide(T a, U b) {
            return a.doubleValue() / b.doubleValue();
        }

        public static <T extends Number, U extends Number> double subtraction(T a, U b) {
            return a.doubleValue() - b.doubleValue();
        }

        public static void main(String[] args) {
            System.out.println("Sum: " + Calculator.sum(5, 3.5));
            System.out.println("Multiply: " + Calculator.multiply(2, 4.0));
            System.out.println("Divide: " + Calculator.divide(10, 2.5));
            System.out.println("Subtraction: " + Calculator.subtraction(8, 3.5));
        }
    }
}

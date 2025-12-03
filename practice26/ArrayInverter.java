package practice26;

import java.util.*;

public class ArrayInverter {
    public static <T> T[] invertArray(T[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        Stack<T> stack = new Stack<>();

        for (T element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        return array;
    }

    public static int[] invertArray(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }

        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        return array;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив Integer: " + java.util.Arrays.toString(intArray));
        invertArray(intArray);
        System.out.println("Инвертированный массив: " + java.util.Arrays.toString(intArray));
        System.out.println();

        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("Исходный массив String: " + java.util.Arrays.toString(strArray));
        invertArray(strArray);
        System.out.println("Инвертированный массив: " + java.util.Arrays.toString(strArray));
        System.out.println();
    }
}

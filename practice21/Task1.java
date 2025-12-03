package practice21;

import java.util.*;

public class Task1 {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange"};
        System.out.println(convertArrayToList(strings));

        System.out.println();

        Integer[] integers = {0, 1, 2};
        System.out.println(convertArrayToList(integers));
    }
}

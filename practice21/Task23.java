package practice21;

import java.util.*;

public class Task23 {
    public static class Array<T> {
        private T[] array;

        public Array(T[] array) {
            this.array = array;
        }

        public T getElement(int index) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException("Индекс: " + index);
            }
            return array[index];
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {12, 223, 41};
        Array<Integer> IntArray = new Array<>(integers);
        System.out.println("Массив Integer: " + IntArray);
        System.out.println("Элемент с индексом 0: " + IntArray.getElement(0));

        System.out.println();

        String[] strings = {"apple", "banana", "orange"};
        Array<String> StrArray = new Array<>(strings);
        System.out.println("Массив String: " + StrArray);
        System.out.println("Элемент с индексом 1: " + StrArray.getElement(1));
    }
}

package practice20;

import java.io.*;

public class Task123 {
    public static class Animal implements Serializable {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal{name='" + name + "'}";
        }
    }

    public static class Triple<T extends Comparable<T>, V extends Animal, K> {
        private T first;
        private V second;
        private K third;

        public Triple(T first, V second, K third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public T getFirst() {
            return first;
        }

        public V getSecond() {
            return second;
        }

        public K getThird() {
            return third;
        }

        public void printClassNames() {
            System.out.println("T: " + first.getClass().getSimpleName() + ": " + first);
            System.out.println("V: " + second.getClass().getSimpleName() + ": " + second);
            System.out.println("K: " + third.getClass().getSimpleName() + ": " + third);
        }
    }
    public static void main(String[] args) {
        Triple<String, Animal, Integer> triple = new Triple<>("Hello", new Animal("Dog"), 123);
        triple.printClassNames();
    }
}

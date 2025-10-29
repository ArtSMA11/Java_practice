package practice11;

import java.util.*;

public class Task5 {
    private static long testInsert(List<Integer> list, int size) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++){
            list.add(i);
        }
        return System.nanoTime() - startTime;
    }

    private static long testAccess(List<Integer> list, int size) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++){
            list.get(i);
        }
        return System.nanoTime() - startTime;
    }

    private static long testRemove(List<Integer> list, int size) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++){
            list.remove(0);
        }
        return System.nanoTime() - startTime;
    }

    private static long testSearch(List<Integer> list, int size) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++){
            list.contains(i);
        }
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        int size = 100000;

        List<Integer> arrayList = new ArrayList<>();
        long arrayListInsertTime = testInsert(arrayList, size);
        long arrayListAccessTime = testAccess(arrayList, size);
        long arrayListRemoveTime = testRemove(arrayList, size);
        long arrayListSearchTime = testSearch(arrayList, size);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListInsertTime = testInsert(linkedList, size);
        long linkedListAccessTime = testAccess(linkedList, size);
        long linkedListRemoveTime = testRemove(linkedList, size);
        long linkedListSearchTime = testSearch(linkedList, size);

        System.out.println("Операция\t\t\tArrayList\tLinkedList");
        System.out.println("Вставка\t\t\t\t" + arrayListInsertTime + "\t\t" + linkedListInsertTime);
        System.out.println("Доступ по индексу\t" + arrayListAccessTime + "\t\t" + linkedListAccessTime);
        System.out.println("Удаление\t\t\t" + arrayListRemoveTime + "\t" + linkedListRemoveTime);
        System.out.println("Поиск\t\t\t\t" + arrayListSearchTime + "\t\t" + linkedListSearchTime);
    }
}

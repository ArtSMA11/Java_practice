package practice10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        List<Student> list1 = Arrays.asList(
                new Student("Артём", "Абаджян", "Английский", 2, "ПВБО-01-24", 3.2),
                new Student("Маргарита", "Овчаренко", "ДифУры", 2, "ПВБО-01-24", 5),
                new Student("Мария", "Васильева", "Немецкий", 2, "ПВБО-01-24", 4),
                new Student("Кристина", "Мордвинова", "Жизнь", 2, "ПВБО-01-24", 4.2)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Максим", "Садреев", "Бокс", 2, "ПВБО-01-24", 4.5),
                new Student("Мурад", "Галиев", "Качалка", 2, "КВБО-31-24", 3.5)
        );

        System.out.println("=== Начальные списки ===");
        sorter.setArray(list1);
        sorter.outArray();
        sorter.setArray(list2);
        sorter.outArray();

        sorter.setArray(list1);

        System.out.println("=== Сортировка по GPA (быстрая сортировка) ===");
        sorter.quicksortByGPA();
        sorter.outArray();

        System.out.println("=== Сортировка по GPA (сортировка слиянием) ===");
        sorter.mergeSortByGPA();
        sorter.outArray();

        System.out.println("=== Сортировка по фамилии ===");
        sorter.sortBySurnameName();
        sorter.outArray();

        System.out.println("=== Объединение двух списков ===");
        sorter.mergeLists(list1, list2);
        sorter.outArray();
    }
}

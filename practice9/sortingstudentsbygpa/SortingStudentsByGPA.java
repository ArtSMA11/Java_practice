package practice9.sortingstudentsbygpa;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }


    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high); // Разделяем массив
            quickSort(students, low, pi - 1); // Сортируем левую часть
            quickSort(students, pi + 1, high); // Сортируем правую часть
        }
    }


    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high]; // Берем последний элемент как опорный
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    public void quickSort(Student[] students) {
        quickSort(students, 0, students.length - 1);
    }
}

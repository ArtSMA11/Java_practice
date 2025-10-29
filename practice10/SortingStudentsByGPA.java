package practice10;

import java.util.*;

public class SortingStudentsByGPA {
    private Student[] iDNumber;
    private List<Student> studentList;

    public SortingStudentsByGPA() {
        this.studentList = new ArrayList<>();
    }

    public void setArray(List<Student> students) {
        this.studentList = new ArrayList<>(students);
        this.iDNumber = students.toArray(new Student[0]);
    }


    class GPAComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }

    class SurnameComparator implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.getSurname().compareTo(b.getSurname());
        }
    }

    private void quicksort(Student[] array, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pi = partition(array, low, high, comp);
            quicksort(array, low, pi - 1, comp);
            quicksort(array, pi + 1, high, comp);
        }
    }

    private int partition(Student[] array, int low, int high, Comparator<Student> comp) {
        Student pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comp.compare(array[j], pivot) < 0) {
                i++;
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Student temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    private Student[] mergeSort(Student[] array, Comparator<Student> comp) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Student[] left = Arrays.copyOfRange(array, 0, mid);
        Student[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left, comp);
        right = mergeSort(right, comp);

        return merge(left, right, comp);
    }

    private Student[] merge(Student[] left, Student[] right, Comparator<Student> comp) {
        Student[] result = new Student[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (comp.compare(left[i], right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public void sortBySurnameName() {
        if (iDNumber != null) {
            quicksort(iDNumber,0, iDNumber.length - 1, new SurnameComparator());
        }
        if (studentList != null) {
            studentList.sort((a, b) -> new SurnameComparator().compare(a, b));
        }
    }

    public void quicksortByGPA() {
        if (iDNumber != null) {
            quicksort(iDNumber, 0, iDNumber.length - 1, new GPAComparator());
        }
    }

    public void mergeSortByGPA() {
        if (iDNumber != null) {
            iDNumber = mergeSort(iDNumber, new GPAComparator());
        }
    }

    public void mergeLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        setArray(mergedList);
    }

    public void outArray() {
        if (iDNumber != null) {
            for (Student student : iDNumber) {
                System.out.println(student);
            }
        }
        System.out.println();
    }
}

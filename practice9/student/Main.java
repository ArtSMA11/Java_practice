package practice9.student;

public class Main {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getID() > current.getID()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }

    public static void print(Student[] students){
        for (Student student : students){
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(105, "Иван Петров", 4.5),
                new Student(102, "Мария Сидорова", 4.8),
                new Student(107, "Алексей Иванов", 4.2),
                new Student(101, "Елена Козлова", 4.9),
                new Student(103, "Дмитрий Смирнов", 4.3)
        };

        print(students);
        System.out.println();
        insertionSort(students);
        print(students);
    }
}

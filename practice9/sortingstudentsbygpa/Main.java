package practice9.sortingstudentsbygpa;

public class Main {
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

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        print(students);
        System.out.println();
        sorter.quickSort(students);
        print(students);
    }
}

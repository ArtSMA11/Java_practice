package practice9.student;

public class Student {
    private int ID;
    private String name;
    private double grade;

    public Student(int ID, String name, double grade) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

package practice9.sortingstudentsbygpa;

public class Student {
    private int ID;
    private String name;
    private double gpa;

    public Student(int ID, String name, double gpa) {
        this.ID = ID;
        this.name = name;
        this.gpa = gpa;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", grade=" + gpa +
                '}';
    }
}

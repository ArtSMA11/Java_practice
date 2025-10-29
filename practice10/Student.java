package practice10;

public class Student {
    private String name;
    private String surname;
    private String profession;
    private int grade;
    private String group;
    private double gpa;

    public Student(String name, String surname, String profession, int grade, String group, double gpa) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.grade = grade;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", grade=" + grade +
                ", group='" + group + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

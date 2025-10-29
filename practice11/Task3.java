package practice11;

import java.text.SimpleDateFormat;
import java.util.*;

public class Task3 {
    public static class Student{
        private String name;
        private String surname;
        private int grade;
        private String group;
        private double gpa;
        private Date birthday;

        public Student(String name, String surname, int grade, String group, double gpa, Date birthday) {
            this.name = name;
            this.surname = surname;
            this.grade = grade;
            this.group = group;
            this.gpa = gpa;
            this.birthday = birthday;
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

        public Date getBirthday() {
            return birthday;
        }

        public void setBirthday(Date birthday) {
            this.birthday = birthday;
        }

        public String getFormattedBirthday(String formatType) {
            SimpleDateFormat dateFormat;

            switch (formatType.toLowerCase()) {
                case "short":
                    dateFormat = new SimpleDateFormat("dd.MM.yy");
                    break;
                case "medium":
                    dateFormat = new SimpleDateFormat("dd MMM yyyy");
                    break;
                case "full":
                    dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy 'г.'");
                    break;
                default:
                    dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            }
            return dateFormat.format((birthday));
        }

        @Override
        public String toString() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", grade=" + grade +
                    ", group='" + group + '\'' +
                    ", gpa=" + gpa +
                    ", birthday=" + dateFormat.format(birthday) +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Артём", "Абаджян", 2 , "ПВБО-01-24", 3.2, new Date(106, 10, 23));

        System.out.println("Полная информация :\n" + student);
        System.out.println("Дата рождения (короткий формат): " + student.getFormattedBirthday("short"));
        System.out.println("Дата рождения (средний формат): " + student.getFormattedBirthday("medium"));
        System.out.println("Дата рождения (полный формат): " + student.getFormattedBirthday("full"));
    }
}


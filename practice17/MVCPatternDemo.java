package practice17;

public class MVCPatternDemo {
    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Артём");
        student.setRollNo("12");
        return student;
    }

    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("14");
        controller.updateView();
    }
}

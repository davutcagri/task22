public class Student extends Person{
    private int studentId;
    private String faculty;


    public Student(String name, String surname, int age, int studentId, String faculty) {
        super(name, surname, age);
        this.studentId = studentId;
        this.faculty = faculty;
    }

    public void print() {
        super.print();
        System.out.println("Grade: " + studentId);
        System.out.println("Faculty: " + faculty);
    }
}

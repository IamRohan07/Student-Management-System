package school;

public class Student extends Person {
    private String studentId;
    private String course;
    private static int studentIdCounter = 1;
    public Student(String name, int age, String course) {
        super(name, age);
        this.studentId = getStudentId();
        this.course = course;
    }
    private String getStudentId(){
        return String.format("ST%03d",studentIdCounter++);
    }
    @Override
    public void displayDetails() {
        System.out.println("Student: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("-------------------------");
    }
}
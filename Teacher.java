package school;

public class Teacher extends Person {
    private String subject;
    private String teacherId;
    private static int teacherIdIncrement = 1;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.teacherId = getTeacherId();
        this.subject = subject;
    }
    private String getTeacherId(){
        return String.format("T%03d",teacherIdIncrement++);
    }

    public void displayDetails() {
        System.out.println("Teacher: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
        System.out.println("-------------------------");
    }
}
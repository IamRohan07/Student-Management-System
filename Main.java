package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Person> students = new ArrayList<>();
        ArrayList<Person> teachers = new ArrayList<>();
        // Adding Student objects to students
        students.add(new Student("Rohan", 20,  "Computer Science"));
        students.add(new Student("Melwin", 19,  "AI & ML"));

        // Adding Teacher objects to teachers
        teachers.add(new Teacher("Mr. Arjun", 35, "Java Programming"));
        teachers.add(new Teacher("Mrs. Kavya", 40, "Database Systems"));

        while(true){
            System.out.println();
            System.out.println();
            System.out.println("1.Show Students Data");
            System.out.println("2.Show Teachers Data");
            System.out.println("3.Show All Persons Data");
            System.out.println("4.Add New Student Data");
            System.out.println("5.Add New Teacher Data");
            System.out.println("6.Exit");
            System.out.print("Enter your Choice:");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice) {
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.println("\tShow Students Data");
                    System.out.println("-------------------------------------------");
                    for (Person s : students) {
                        s.displayDetails();
                    }
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("\tShow Teachers Data");
                    System.out.println("-------------------------------------------");
                    for (Person t : teachers) {
                        t.displayDetails();
                    }
                    break;
                case 3:
                    System.out.println("-------------------------------------------");
                    System.out.println("\tShow All Persons Data");
                    System.out.println("-------------------------------------------");
                    // Polymorphism (each object calls its own displayDetails())
                    for (Person t : teachers) {
                        t.displayDetails();
                    }
                    for (Person s : students) {
                        s.displayDetails();
                    }
                    break;
                case 4:
                    System.out.print("Enter Your Student Name: ");
                    String studentName = input.nextLine();
                    System.out.print("Enter Your Student age: ");
                    int studentAge = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Your Student Course: ");
                    String studentCourse = input.nextLine();
                    students.add(new Student(studentName,studentAge,studentCourse));
                    System.out.println("\t\tStudent Details added!!!");
                    break;
                case 5:
                    System.out.print("Enter Your Teachers Name: ");
                    String teacherName = input.nextLine();
                    System.out.print("Enter Your Teachers age: ");
                    int teacherAge = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Your Teachers Subject: ");
                    String teacherCourse = input.nextLine();
                    teachers.add(new Student(teacherName,teacherAge,teacherCourse));
                    System.out.println("\t\tTeacher Details added!!!");
                    break;
                case 6:
                    System.out.println("Thank You!!!");
                    return;
                default:
                    System.out.println("Enter the valid input!");
            }
        }

    }
}
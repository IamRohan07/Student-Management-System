package school;

public abstract class Person {
    private String name;
    private int age;

    // Constructor
    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Encapsulation (getters & setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method (runtime polymorphism)
    public abstract void displayDetails();

}

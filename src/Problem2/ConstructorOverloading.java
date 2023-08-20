// Write a program in Java to develop overloaded constructor. Also develop the copy constructor to 
//create a new object with the state of the existing 0bject.
package Problem2;

class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Overloaded constructor with name parameter
    public Student(String name) {
        this.name = name;
        age = 0;
    }

    // Overloaded constructor with both name and age parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ConstructorOverloading {
     public static void main(String[] args) {
        // Using different constructors
        Student defaultStudent = new Student();
        Student fullStudent = new Student("Bob", 25);

        // Using copy constructor
        Student copiedStudent = new Student(fullStudent);

        // Displaying student details
        System.out.println("Default Student:");
        defaultStudent.display();

//        System.out.println("\nNamed Student:");
//        namedStudent.display();

        System.out.println("\nFull Student:");
        fullStudent.display();

        System.out.println("\nCopied Student:");
        copiedStudent.display();
    }
}

// Write a program in Java to demonstrate use of this keyword. Check whether this can access the 
//private members of the class or not.
package Problem3;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details using instance variables
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to update age using this keyword
    public void updateAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }
    }
}
public class UseThisKeyAndAccessPrivetClass {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Displaying details using display method
        System.out.println("Person's Details:");
        person.display();

        // Updating age using updateAge method
        person.updateAge(3);

        // Displaying details after updating age
        System.out.println("\nUpdated Person's Details:");
        person.display();
    } 
}

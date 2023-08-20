// Write a program that creates an array list, adds a Loan object, a Date Object, a string, and a Circle 
//object to the list. Then, using a loop and the toString() method of each object, show each element 
//in the list
package Problem9;

import java.util.ArrayList;
import java.util.Date;

class Loan {
    private double amount;

    public Loan(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan amount: " + amount;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        
        Loan loan = new Loan(10000.0);
        Date date = new Date();
        String text = "Hello, world!";
        Circle circle = new Circle(5.0);

        objects.add(loan);
        objects.add(date);
        objects.add(text);
        objects.add(circle);

        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
    }
}


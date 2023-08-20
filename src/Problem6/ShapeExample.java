//Describe abstract class called Shape which has three subclasses say Triangle, Rectangle, and Circle. 
//Define one method area() in the abstract class and override this area() in these three subclasses to 
//calculate for specific object i.e. area() of Triangle Subclass should calculate area of triangle etc. 
//Same for Rectangle and Circle
package Problem6;

// Abstract Shape class
abstract class Shape {
    abstract double area(); // Abstract method to calculate area
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height; // Calculate area of triangle
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height; // Calculate area of rectangle
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius; // Calculate area of circle
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0, 8.0);
        System.out.println("Area of Triangle: " + triangle.area());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Circle circle = new Circle(3.0);
        System.out.println("Area of Circle: " + circle.area());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
abstract class Shape{
abstract double area();
} 

class Rectangle extends Shape{
   double width;
   double height;
    public Rectangle(double width,double height) {
        this.width=width;
        this.height=height;
    }
  

    @Override
    double area() {
        return width * height; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

public class shapeArea {
    public static void main(String[] args) {
         Rectangle resultrect = new Rectangle(10, 20.5);
         System.out.println(resultrect.area());
    }
}

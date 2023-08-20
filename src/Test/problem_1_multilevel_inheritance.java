/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

class Animal{ void animal(){ System.out.println("This is animal class!");} }
class Dog extends Animal{ void dog(){ System.out.println("This is Dog class");} }
class Cat extends Dog {void cat(){System.out.println("this is cat class");}}
public class problem_1_multilevel_inheritance {
    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.cat();
        obj.dog();
        obj.animal();
    }
}

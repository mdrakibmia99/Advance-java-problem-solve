/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

class Animal { void animalClass(){ System.out.println("This is animal class");}}
class Cat extends Animal { void cat(){System.out.println("This is cat class");}}
class Dog extends Animal { void dog(){ System.out.println("This is dog class");}}
public class problem_1_hierarchical_inheritance {
    public static void main(String[] args) {
        Cat obj1=new Cat();
        Dog obj2= new Dog();
        
        obj1.animalClass();
        obj1.cat();
        
        obj2.animalClass();
        obj2.dog();
        
        
    }
}

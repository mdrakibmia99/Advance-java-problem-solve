/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

class Animal {

    void eat(){ System.out.println("Animal is eating");}
}
class Cat extends Animal{
  void bark(){System.out.println("cat is barking!!"); }
}

public class problem_1_single_inheritance {
    public static void main(String[] args) {
        System.out.println("This is sigle inheritance program \n");
         Cat obj=new Cat();
         obj.eat();
         obj.bark();
    }
 
}

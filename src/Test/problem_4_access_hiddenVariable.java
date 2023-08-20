/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

class A{ static String name="Rakib"; }

class B extends A{ 
  String name="Hasna";
  void display(){
  System.out.println("Current class name="+name);
      System.out.println("Parent class name"+A.name);
}}
public class problem_4_access_hiddenVariable {
    public static void main(String[] args) {
         B obj = new B();
         obj.display();
    }
    
}

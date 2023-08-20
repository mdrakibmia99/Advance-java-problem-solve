/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

class ConstructorOverloadCopy {

    public String name;
    public int id;

    public ConstructorOverloadCopy() {
        System.out.println("This is default constructor");
    }

    public ConstructorOverloadCopy(String name, int id) {
        this.name = name;
        this.id = id;
    }

//    copy constructor 
    public ConstructorOverloadCopy(ConstructorOverloadCopy info) {
        this.name = info.name;
        this.id = info.id;
    }

    public void display() {
        System.out.println("Name=" + name);
        System.out.println("Id=" + id);
    }

}

public class problem_2_constructor_overloading_copy {

    public static void main(String[] args) {
        ConstructorOverloadCopy def = new ConstructorOverloadCopy();
        ConstructorOverloadCopy studentinfo = new ConstructorOverloadCopy("Rakib", 2029);

        studentinfo.display();
//        copy constructor 
        ConstructorOverloadCopy copyInfo = new ConstructorOverloadCopy(studentinfo);
        copyInfo.display();
    }
}

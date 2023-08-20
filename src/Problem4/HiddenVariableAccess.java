//Write an application that illustrates how to access a hidden variable. Class A declares a static 
//variable x, The class B extends A and declares an instance variable x, display() method in class B 
//dis la s both of these variables
package Problem4;
class A {
    static int x = 10;
}

class B extends A {
    int x = 20;

    public void display() {
        System.out.println("Value of x in class A: " + A.x);
        System.out.println("Value of x in class B: " + this.x);
    }
}
public class HiddenVariableAccess {
     public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

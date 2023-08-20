
package problemsolve;

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Animal is barking!!");
    }
}
class SpecialAnimal extends Dog{
    void special(){System.out.println("this is a special animal");}
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        SpecialAnimal obj= new SpecialAnimal();
        obj.bark();
        obj.eat();
        obj.special();
    }
}

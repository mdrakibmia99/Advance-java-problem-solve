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

public class SingleInheritance {

    public static void main(String[] args) {
        Dog objDog = new Dog();
        objDog.bark();
        objDog.eat();
    
    }
}

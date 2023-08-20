package problemsolve;

// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {
        // Creating instances of the child classes
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods from parent and child classes
        dog.eat();   // Inherited from Animal class
        dog.bark();  // Specific to Dog class

        cat.eat();   // Inherited from Animal class
        cat.meow();  // Specific to Cat class
    }
}

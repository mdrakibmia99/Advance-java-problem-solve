package Test;

class Person {

    private String name;
    private int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Name=" + this.name);
        System.out.println("Id=" + this.id);
    }

}

public class Problem_3_this_keyword {

    public static void main(String[] args) {
        Person obj = new Person("Rakib", 12345);
    }
}

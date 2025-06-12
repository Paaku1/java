package test;
class Animal {
    void speak() {
        System.out.println("This animal speaks in its own way.");
    }
}
class Dog extends Animal {
    void speak() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    void speak() {
        System.out.println("Meow");
    }
}
public class Poly {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Cat();
        Animal c = new Dog();

        a.speak();
        b.speak();
        c.speak();
    }
}

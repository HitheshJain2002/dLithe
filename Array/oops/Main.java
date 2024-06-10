package oops;

class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog(); // Upcasting
        Animal cat = new Cat(); // Upcasting

        animal.sound(); // Output: Animal makes a sound
        dog.sound();    // Output: Dog barks

    }
}


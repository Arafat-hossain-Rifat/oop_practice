package oop;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        System.out.println("Name of the dog: " + myDog.getName());
        System.out.println("Name of the cat: " + myCat.getName());

        myDog.makeSound();
        myCat.makeSound();

        myDog.move();
        myCat.move();

    }
}

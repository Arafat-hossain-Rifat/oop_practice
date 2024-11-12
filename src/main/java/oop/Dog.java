package oop;

class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void move() {
        System.out.println("Dog runs.");
    }
}
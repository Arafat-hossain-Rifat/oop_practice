package oop;

class Cat extends Mammal {

     Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    @Override
    public void move() {
        System.out.println("Cat walks.");
    }
    public void run(){
        System.out.println("run");
    }
}
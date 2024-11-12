package oop;

abstract class Mammal implements Animall {
    private final String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}

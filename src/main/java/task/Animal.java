package task;

public class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void EatFood() {
        System.out.println("Animal is eating food");
    }

    public void PrintInfo() {
        System.out.println("My age is " + age + ", my weight is " + weight);
    }
}

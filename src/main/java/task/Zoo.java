package task;

import java.util.List;

public class Zoo {
    private String city;
    private List<Animal> animals;

    public Zoo(List<Animal> animals, String city) {
        this.animals = animals;
        this.city = city;
    }

    public void PrintAnimals() {
        System.out.println("In " + city + " zoo we have animals:");
        for (Animal animal : animals) {
            animal.PrintInfo();
        }
    }

    public void PrintAnimals2(){
        System.out.println("In %s zoo we have animals:".formatted(city));
        animals.stream().forEach(animal -> animal.PrintInfo());
    }

    public void PrintAnimals3(){
        System.out.println("In %s zoo we have animals:".formatted(city));
        animals.forEach(animal -> animal.PrintInfo());
    }

    public void FeedAnimals() {
        System.out.println("Let's feed animals in " + city + " Zoo!");
        int i = 0;
        while (i < animals.size()) {
            animals.get(i).EatFood();
            i++;
        }
    }

    public String GetCity() {
        return city;
    }
}

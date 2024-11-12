package task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(25, 70));
        animals.add(new Animal(3, 4.55));
        animals.add(new Monkey(7, 39.5, "Banana"));
        animals.add(new Donkey(12, 69, "Donny"));
        animals.add(new Monkey(18, 75, "Bamboo"));
        animals.add(new Donkey(2, 32.2, "Little"));

        // Show animals in the console(Extra)
        System.out.println("Displaying animals :");
        for (Animal a : animals) {
            a.PrintInfo();  // Call PrintAnimals for each zoo
        }

        Zoo zoo = new Zoo(animals, "New York");
        zoo.PrintAnimals();
        zoo.FeedAnimals();

        List<Animal> filteredAnimals = AnimalsFilter.FilterByAge(animals, 10);
        Zoo filteredZoo = new Zoo(filteredAnimals, "City of grown-up animals");
        filteredZoo.PrintAnimals();

        List<Zoo> zoos = new ArrayList<>();
        zoos.add(zoo);
        zoos.add(filteredZoo);
        // Show animals from both zoos in the console(Extra)
        System.out.println("Displaying animals from both zoos:");
        for (Zoo z : zoos) {
            z.PrintAnimals();  // Call PrintAnimals for each zoo
        }

        System.out.println("Practice with lambda");
        List<Zoo> grownUpZoos = zoos.stream()
                .filter(z -> z.GetCity().contains("grown-up"))
                .collect(Collectors.toList());

        grownUpZoos.forEach(Zoo::PrintAnimals);
    }
}
package task;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalsFilter {
    public static List<Animal> FilterByAge(List<Animal> animals, int minAge) {
        return animals.stream()
                .filter(animal -> animal.getAge() > minAge)
                .collect(Collectors.toList());
    }
}
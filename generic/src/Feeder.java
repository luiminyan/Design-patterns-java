import java.util.List;

public class Feeder {
    public void feed(List<Animal> animalList){
        for (Animal animal:animalList){
            animal.eat();
        }

    }
}

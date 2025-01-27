package assisted.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal",10);
        animal.showData();

        Dog dog = new Dog("Dog",5);
        dog.showData();

        Cat cat = new Cat("Cat",2);
        cat.showData();

        Bird bird = new Bird("Bird",3);
        bird.showData();

    }
}

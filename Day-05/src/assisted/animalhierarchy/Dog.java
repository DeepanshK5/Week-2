package assisted.animalhierarchy;

class Dog extends Animal {
    Dog(String name, double age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog making sound");
    }
}

package assisted.animalhierarchy;

class Bird extends Animal {
    Bird(String name, double age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird making sound");
    }
}

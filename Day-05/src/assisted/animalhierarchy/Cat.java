package assisted.animalhierarchy;

class Cat extends Animal {
    Cat(String name, double age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat making sound");
    }
}

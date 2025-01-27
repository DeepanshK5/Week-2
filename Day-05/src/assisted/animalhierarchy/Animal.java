package assisted.animalhierarchy;

class Animal {
    String name;
    double age;

    Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    void showData() {
        System.out.println("Name = " + this.name + " age = " + this.age);
    }

    public void makeSound() {
        System.out.println("Animal making sound");
    }
}

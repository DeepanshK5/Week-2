public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        // Creating a person using parameterized constructor
        Person original = new Person("Deepansh", 21);
        System.out.println("Person:");
        System.out.println("Name: " + original.name);
        System.out.println("Age: " + original.age);

        // Creating a new person using copy constructor
        Person clone = new Person(original);
        System.out.println("Cloned Person:");
        System.out.println("Name: " + clone.name);
        System.out.println("Age: " + clone.age);
    }
}

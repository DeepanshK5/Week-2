package hierarchicalinheritance.schoolsystem;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println(this.name + " is a person.");
    }
}

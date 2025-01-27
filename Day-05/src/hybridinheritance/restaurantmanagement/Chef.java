package hybridinheritance.restaurantmanagement;

// Subclass hierarchicalinheritance.Chef inheriting from Person and implementing hierarchicalinheritance.Worker
class Chef extends Person1 implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking.");
    }
}

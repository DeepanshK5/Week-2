package hybridinheritance.restaurantmanagement;

// Subclass hierarchicalinheritance.Waiter inheriting from Person and implementing hierarchicalinheritance.Worker
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food.");
    }
}

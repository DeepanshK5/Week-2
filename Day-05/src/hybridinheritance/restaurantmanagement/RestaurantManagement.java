package hybridinheritance.restaurantmanagement;

// Test the system
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("ABC", 1);
        Waiter waiter = new Waiter("XYZ", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}

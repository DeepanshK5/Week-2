package encapsulationandpolymorphism.fooddeliverysystem;

// Main Class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Creating food items
        VegItem vegItem = new VegItem("Veg-Pizza", 2000, 2);
        NonVegItem nonVegItem = new NonVegItem("NonVeg-Pizza", 3000, 1, 5);

        // Storing food items in an array
        FoodItem[] foodItems = {vegItem, nonVegItem};

        System.out.println("Order Details and Total Price Calculation:");
        for (int i = 0; i < foodItems.length; i++) {
            foodItems[i].getItemDetails();
            double totalPrice = foodItems[i].calculateTotalPrice();
            System.out.println("Total Price (Before Discount): " + totalPrice);

            if (foodItems[i] instanceof Discountable) {
                Discountable discountable = (Discountable) foodItems[i];
                System.out.println(discountable.getDiscountDetails());
                double discountedPrice = discountable.applyDiscount(10.0); // Applying a 10% discount
                System.out.println("Total Price (After Discount): " + discountedPrice);
            }
        }
    }
}

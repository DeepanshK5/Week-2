package encapsulationandpolymorphism.fooddeliverysystem;

// NonVegItem Class
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge; // Additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    @Override
    public double applyDiscount(double percentage) {
        double discount = calculateTotalPrice() * (percentage / 100);
        return calculateTotalPrice() - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applicable for NonVegItem.";
    }
}

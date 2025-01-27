package encapsulationandpolymorphism.ecommerceplatform;

// Groceries class
class Groceries extends Product {
    private double discountRate;

    public Groceries(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountRate / 100);
    }
}

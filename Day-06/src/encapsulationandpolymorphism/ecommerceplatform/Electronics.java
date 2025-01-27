package encapsulationandpolymorphism.ecommerceplatform;

// Electronics class
class Electronics extends Product implements Taxable {
    private double discountRate;
    private double taxRate;

    public Electronics(int productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * (discountRate / 100);
    }

    @Override
    public double calculateTax() {
        return getPrice() * (taxRate / 100);
    }

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate;
    }
}

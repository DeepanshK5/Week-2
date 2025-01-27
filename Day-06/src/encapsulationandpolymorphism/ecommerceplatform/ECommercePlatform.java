package encapsulationandpolymorphism.ecommerceplatform;

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating product objects
        Electronics electronics = new Electronics(1, "Laptop", 50000, 10, 18);
        Clothing clothing = new Clothing(2, "Jacket", 2000, 20, 5);
        Groceries groceries = new Groceries(3, "Rice", 500, 5);

        // Storing products in an array
        Product[] products = {electronics, clothing, groceries};

        System.out.println("Product Details and Final Prices:");
        for (int i = 0; i < products.length; i++) {
            products[i].displayDetails();

            double discount = products[i].calculateDiscount();
            double tax = (products[i] instanceof Taxable) ? ((Taxable) products[i]).calculateTax() : 0;
            double finalPrice = products[i].getPrice() + tax - discount;

            if (products[i] instanceof Taxable) {
                System.out.println(((Taxable) products[i]).getTaxDetails());
            }

            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
        }
    }
}

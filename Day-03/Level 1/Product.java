public class Product {
    static double discount = 5.0; // Discount percentage shared by all products
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount);
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID " + this.productID);
            System.out.println("Product Name " + this.productName);
            System.out.println("Price " + this.price);
            System.out.println("Quantity " + this.quantity);
            System.out.println("Discount " + discount);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 1200, 20);
        Product p2 = new Product(2, "Headphones", 500, 5);

        System.out.println("Product Details");
        p1.displayDetails();
        p2.displayDetails();

        Product.updateDiscount(15.0);

        System.out.println("Updated Product Details");
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
    }
}

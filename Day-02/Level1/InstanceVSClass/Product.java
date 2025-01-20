public class Product {

    //Instance Variable
    String productName;
    double price;

    //Class Variable
    static int totalProducts;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    //Method
    public void displayProductDetails(){
        System.out.println("The Name of product is "+ this.productName);
        System.out.println("The Price of product is "+ this.price);
    }

    //Method
    public static void displayTotalProducts(){
        System.out.println("Total Number of product is "+totalProducts);
    }

    //Main Method
    public static void main(String[] args) {
        Product product1 = new Product("Keyboard",1000);
        Product product2 = new Product("Mouse",500);

        product1.displayProductDetails();
        product2.displayProductDetails();

        Product.displayTotalProducts();
    }
}

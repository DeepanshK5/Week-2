class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize a cart item
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the total price of the item
    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    CartItem[] cart;
    int itemCount;

    // Constructor to initialize the shopping cart
    ShoppingCart(int size) {
        cart = new CartItem[size];
        itemCount = 0;
    }

    // Method to add an item to the cart
    void addItem(String itemName, double price, int quantity) {
        if (itemCount < cart.length) {
            cart[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println(quantity + " " + itemName + "(s) added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    void removeItem(String itemName) {
        boolean itemFound = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equalsIgnoreCase(itemName)) {
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null;
                itemCount--;
                System.out.println(itemName + " removed from the cart.");
                itemFound = true;
                break;
            }
        }
        if (!itemFound) {
            System.out.println("Item not found in the cart.");
        }
    }

    // Method to display the total cost
    void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cart[i].getTotalPrice();
        }
        System.out.println("Total Cost: " + totalCost);
    }

    // Method to display all items in the cart
    void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cart[i].itemName + " - Price: " + cart[i].price + ", Quantity: " + cart[i].quantity + ", Total: " + cart[i].getTotalPrice());
            }
        }
    }

    public static void main(String[] args) {
        // Creating a ShoppingCart object with a fixed size
        ShoppingCart cart = new ShoppingCart(5);

        // Adding items to the cart
        cart.addItem("Apple", 0.99, 5);
        cart.addItem("Banana", 0.59, 10);

        // Displaying cart items
        cart.displayCartItems();

        // Displaying the total cost
        cart.displayTotalCost();

        // Removing an item from the cart
        cart.removeItem("Apple");

        // Displaying cart items again
        cart.displayCartItems();

        // Displaying the total cost again
        cart.displayTotalCost();
    }
}
